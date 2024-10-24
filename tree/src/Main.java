//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createTree();

        System.out.println(root.data);

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
        tree.traversePostOrderByIterative(root);

    }
}