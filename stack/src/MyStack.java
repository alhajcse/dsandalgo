import java.util.EmptyStackException;

public class MyStack {
    int[] data;
    int top;
    public static int DEFAULT_SIZE=10;

    public MyStack() {
        data=new int[DEFAULT_SIZE];
        top=-1;
    }

    public MyStack(int capacity) throws Exception {
        if(capacity<1){
            throw new Exception("Invalid Stack capacity");
        }
        data=new int[capacity];
        top=-1;
    }

    public int getSize(){
       return top+1;
    }

    public void push(int item){
        if(getSize()==data.length){
            throw new IndexOutOfBoundsException("");
        }
        top++;
        data[top]=item;
    }


    public int pop(){
        if(getSize()==0){
            throw new EmptyStackException();
        }
        int item=data[top];
        top--;
        return item;
    }

    public int peek(){
        if(getSize()==0){
            throw new EmptyStackException();
        }
        return data[top];
    }

    public void display(){
         for(int i=top;i>=0;i--){
             System.out.print(data[i]);
         }
         System.out.println();
    }

}
