import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Size is: "+stack.size());
        System.out.println("Peek element is: "+stack.peek());
        System.out.println("Empty check: "+stack.isEmpty());
        stack.pop();
        System.out.println("Size is: "+stack.size());
        stack.pop();
        System.out.println("Size is: "+stack.size());
        System.out.println("Peek element is: "+stack.capacity());
        System.out.println("Search element is: "+stack.search(1));

    }
}