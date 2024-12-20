package doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public DoublyLinkedList() {
        head = tail=null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void insertFirst(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
        size++;
    }

    public void display() {
        Node current = head;
        System.out.println("Data          Current ref                Next Ref ");
        while (current != null) {
            System.out.println("  "+current.data+" - "+current+" - "+current.next);
            current = current.next;
        }
    }


    public void insertLast(int data)
    {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    public void addAt(int index, int data) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            insertFirst(data);
        }else if(index == size){
            insertLast(data);
        }else{
            Node currentNode = head;
            for(int i = 1; i <= index-1; i++){
                currentNode= currentNode.next;
            }
            System.out.println("Current Node: "+currentNode.data);
            System.out.println("Current Node: "+currentNode.next);
            Node newNode = new Node(data);
            System.out.println("New Node: "+newNode.data);
            System.out.println("New Node: "+newNode.next);
            newNode.next = currentNode.next;
            newNode.prev=currentNode;
            currentNode.next=newNode;
            size++;
        }
    }


    public int removeFirst() {
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == 1){
            head = tail = null;
            size = 0;
        }else {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            size--;
        }

        return head.data;
    }


    public int removeLast(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == 1){
            head = tail = null;
            size = 0;
        }else {
            Node currentNode = tail;
            tail = tail.prev;
            tail.next = null;
            currentNode.prev = null;
            size--;
        }
        return head.data;
    }



    public int removeAt(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            return removeFirst();
        }else if(index == size-1){
            return removeLast();
        }else{
            Node currentNode = head;
            for(int i = 1; i <index; i++){
                currentNode= currentNode.next;
            }
            Node removeRef = currentNode.next;
            currentNode.next=removeRef.next;
            removeRef.prev = null;
            removeRef.next = null;
            size--;
            return removeRef.data;
        }
    }
}
