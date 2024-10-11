import java.util.EmptyStackException;

public class MyStackTest {
    public static void main(String[] args) throws Exception {
        MyStack myStack=new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();

        myStack.display();


        System.out.println("Peek "+myStack.peek());
    }
}
