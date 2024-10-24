public class BSTTest {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        Node root=tree.getRoot();

        System.out.println("root is "+root.data);

      //  tree.inorder(root);
        System.out.println("Search key is 80 ");

       Node searchNode= tree.search(root,80);

       if(searchNode!=null)
           System.out.println("search " + searchNode.data);
       else
           System.out.println("Data not found ");
    }
}
