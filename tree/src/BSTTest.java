//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BSTTest {
    public static void main(String[] args) {

        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(100);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(40);
        tree.insert(200);
        tree.insert(150);
        tree.insert(300);

        Node root=tree.getRoot();

        System.out.println("root is : "+root.data);

        tree.preOrder(root);

        System.out.println();
        System.out.println("Height "+tree.height(root));


    }
}