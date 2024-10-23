//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BSTTest {
    public static void main(String[] args) {

        BinarySearchTree tree=new BinarySearchTree();
        //Node root=tree.createTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);


        System.out.println(tree.toString());

//        tree.traversePreOrder(root);
//
//        System.out.println("-----");
//
 //       tree.traversePostOrder(root);
//
//        System.out.println("-----");
//        System.out.println(root.data);
//        tree.traverseInOrder(root);
//
//        tree.maxDepth(root);

//        System.out.println("In Order");
//        tree.traverseInOrderByIterative(root);
//        System.out.println("Pre Order");
//        tree.traversePreOrderByIterative(root);
        System.out.println("Post Order");


    }
}