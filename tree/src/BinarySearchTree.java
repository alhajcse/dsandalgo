public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node createNode(int item){

        Node node=new Node(item);
        node.left=null;
        node.rigth=null;
        return node;
    }

    public void insert(int key) {
        root = insertNode(root,key);
    }

    public Node getRoot() {
        return root;
    }

    public Node insertNode(Node root, int key) {

        if(root==null)
            return createNode(key);

        if (root.data==key)
            return root;

        if(key<root.data)
            root.left=insertNode(root.left,key);
        else
            root.rigth=insertNode(root.rigth,key);

        return root;
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" --> ");
            inorder(root.rigth);
        }
    }


    public Node search(Node root,int key){

        if(root!=null) {
            if (root.data == key)
                return root;
            if (root.data > key) {
                System.out.println("searching " + root.data);
                return search(root.left, key);
            }else{
                System.out.println("searching " + root.data);
                return search(root.rigth, key);
            }
        }
        return null;
    }
}
