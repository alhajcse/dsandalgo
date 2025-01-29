//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        MyQueue queue=new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println( "Size "+queue.getSize());
        queue.display();
        System.out.println("After dequeue");
        queue.dequeue();
        System.out.println("Size "+queue.getSize());
        queue.display();
        System.out.println("After enqueue 5");
        queue.enqueue(5);
        System.out.println("Size "+queue.getSize());
        queue.display();
    }
}