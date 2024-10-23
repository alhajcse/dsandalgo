public class BinarySearchTree {
    private Node root;
    public BinarySearchTree() {
        root = null;
    }
    public void add_left_child(Node root,Node child){
        if(root.data > child.data){
            root.left=child;
        }

    }

    public void add_rigth_child(Node root,Node child){
        if(root.data < child.data){
            root.rigth=child;
        }
    }

    public Node createNode(int item){

        Node node=new Node(item);
        node.left=null;
        node.rigth=null;
        return node;
    }


    public Node createTree(){

        Node node2=createNode(8);
        Node node7=createNode(3);
        Node node9=createNode(10);
        add_left_child(node2,node7);
        add_rigth_child(node2,node9);

        Node node1=createNode(1);
        Node node6=createNode(6);
        add_left_child(node7,node1);
        add_rigth_child(node7,node6);

        Node node8=createNode(4);
        add_left_child(node6,node8);

        Node node5=createNode(14);
        add_rigth_child(node9,node5);

        Node node3=createNode(13);
        add_left_child(node5,node3);

        return node2;
    }

    public void insert(int key) {
        this.root = insertNode(this.root,key);
    }

    public Node insertNode(Node root, int key) {
        if(root == null){
           root=createNode(key);
           return root;
        }

        System.out.println(root.data);

        if(key < root.data){
            root.left=insertNode(root.left,key);


        } else if(key > root.data){
            root.rigth=insertNode(root.rigth,key);

        }
        return root;
    }
}
