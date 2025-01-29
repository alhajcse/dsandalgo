//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicArray array=new DynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);

        System.out.println("Size "+array.getSize());
        array.display();
        int out=array.remove();
        System.out.println("After remove"+out);

        System.out.println("Size "+array.getSize());
        array.display();
    }
}