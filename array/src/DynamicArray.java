public class DynamicArray {
    int[] arr;
    int capacity;
    int currentSize;
    public static final int DEFAULT_SIZE=10;

    public DynamicArray() {
        this.arr=new int[DEFAULT_SIZE];
        capacity=DEFAULT_SIZE;
        currentSize=0;
    }

    public DynamicArray(int capacity) {
        this.arr=new int[capacity];
        this.capacity=capacity;
        currentSize=0;
    }

    public void add(int data){
        if(currentSize==capacity){
            int[] oldArr=arr;
            arr=new int[2*capacity];
            for (int i=0;i<capacity;i++){
                arr[i]=oldArr[i];
            }
            oldArr=null;
            capacity=2*capacity;
        }
        this.arr[currentSize]=data;
        currentSize++;
    }

    public int getSize(){
        return currentSize;
    }

    public void display(){
        for (int i=0;i<currentSize;i++){
            System.out.print(arr[i]+" --> ");
        }
        System.out.println();
    }

    public int remove(){
       int out=arr[currentSize];
       currentSize--;
       return out;
    }


}
