import doublyLinkedList.DoublyLinkedList;
import singlyLinkedlist.Node;
import singlyLinkedlist.SinglyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        System.out.println("Size b: "+singlyLinkedList.getSize());
//
//        singlyLinkedList.insertLast(3);
//        singlyLinkedList.insertLast(4);
//        singlyLinkedList.insertLast(5);
//
//        System.out.println("Size : "+singlyLinkedList.getSize());
//        System.out.println("Before Add");
//        singlyLinkedList.display();
//
//        System.out.println("After value=2 Add First");
//        singlyLinkedList.insertFirst(2);
//        singlyLinkedList.display();
//
//        System.out.println("After value=6 Add Last");
//        singlyLinkedList.insertLast(6);
//        singlyLinkedList.display();
//
//        System.out.println("After value=1 Add Position=3");
//        singlyLinkedList.addAt(3,1);
//        singlyLinkedList.display();
//
//        System.out.println("head: "+singlyLinkedList.getHead());
//        System.out.println("tail: "+singlyLinkedList.getTail());

//        System.out.println("After Remove 1st");
//        singlyLinkedList.removeFirst();
//        singlyLinkedList.display();
//        System.out.println("head: "+singlyLinkedList.getHead());
//        System.out.println("tail: "+singlyLinkedList.getTail());
//
//
//        System.out.println("After Remove Last");
//        singlyLinkedList.removeLast();
//        singlyLinkedList.display();
//        System.out.println("head: "+singlyLinkedList.getHead());
//        System.out.println("tail: "+singlyLinkedList.getTail());

//        System.out.println("After Remove At Pos 2");
//        singlyLinkedList.removeAt(2);
//        singlyLinkedList.display();
//        System.out.println("head: "+singlyLinkedList.getHead());
//        System.out.println("tail: "+singlyLinkedList.getTail());




        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("Size init: "+doublyLinkedList.getSize());

        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(0);

        doublyLinkedList.insertLast(4);

        doublyLinkedList.addAt(2,6);

        doublyLinkedList.insertLast(7);


        System.out.println("Size : "+doublyLinkedList.getSize());
        System.out.println("Before Add");
        doublyLinkedList.display();

        System.out.println("head: "+doublyLinkedList.getHead());
        System.out.println("tail: "+doublyLinkedList.getTail());





        System.out.println("After remove first");
        doublyLinkedList.removeFirst();

        System.out.println("Size : "+doublyLinkedList.getSize());

        doublyLinkedList.display();

        System.out.println("head: "+doublyLinkedList.getHead());
        System.out.println("tail: "+doublyLinkedList.getTail());



        System.out.println("After remove Last");
        doublyLinkedList.removeLast();

        System.out.println("Size : "+doublyLinkedList.getSize());

        doublyLinkedList.display();

        System.out.println("head: "+doublyLinkedList.getHead());
        System.out.println("tail: "+doublyLinkedList.getTail());



        System.out.println("After remove At 1");
        doublyLinkedList.removeAt(1);

        System.out.println("Size : "+doublyLinkedList.getSize());

        doublyLinkedList.display();

        System.out.println("head: "+doublyLinkedList.getHead());
        System.out.println("tail: "+doublyLinkedList.getTail());




    }
}