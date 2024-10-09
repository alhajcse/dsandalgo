package singlyLinkedlist;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public SinglyLinkedList() {
        head =tail= null;
        size = 0;
    }
    public int getSize(){
        return size;
    }

    public void insertFirst(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
       if(size == 0){
           tail = newNode;
       }
       size++;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(size == 0){
            head =tail= newNode;
        }
        tail.next = newNode;
        tail = tail.next;
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
            currentNode.next=newNode;
            size++;
        }
    }

    public void display() {
        Node current = head;
        System.out.println("Data          Current ref                Next Ref ");
        while (current != null) {
            System.out.println("  "+current.data+" - "+current+" - "+current.next);
            current = current.next;
        }
    }

    public int removeFirst(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == 1){
            head = tail = null;
            size = 0;
        }else {
            head = head.next;
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
            Node currentNode = head;
            while (currentNode.next != tail){
                currentNode = currentNode.next;
            }
            tail = currentNode;
            tail.next = null;
            size--;
        }
        return head.data;
    }
}
