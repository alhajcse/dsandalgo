public class MyQueue {
    int[] arr;
    int head;
    int size;
    public static int DEFAULT_SIZE=10;

    public MyQueue() {
        this.arr=new int[DEFAULT_SIZE];
        this.head=0;
        this.size=0;
    }

    public MyQueue(int capacity) throws Exception {
        if(capacity<1){
            throw new Exception("Invalid Capacity");
        }
        this.arr=new int[capacity];
        this.head=0;
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int data){
        if(getSize()==arr.length){
            throw new IndexOutOfBoundsException();
        }
        int tail = (size+head) % arr.length;
        arr[tail]=data;
        size++;
    }


    public int dequeue(){
        if(getSize()==0){
            throw new IndexOutOfBoundsException();
        }
        int out=arr[head];
        head = (head+1) % arr.length;
        size--;
        return out;
    }

    public int peek(){
        if(getSize()==0){
            throw new IndexOutOfBoundsException();
        }
        return arr[head];
    }

    public void display(){
        for(int i=0;i< getSize();i++){
            int idx=(head+i)% arr.length;
            System.out.print(arr[idx]+" <-- ");
        }
        System.out.println();
    }

}
