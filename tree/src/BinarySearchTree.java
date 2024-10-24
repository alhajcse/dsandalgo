public class BinarySearchTree {
    private Node root;
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
        this.root = insertNode(this.root,key);
    }

    public Node getRoot() {
        return root;
    }

    public Node insertNode(Node root, int key) {
        if(root == null){
           root=createNode(key);
           return root;
        }

        if(key < root.data){
            root.left=insertNode(root.left,key);

        } else if(key > root.data){
            root.rigth=insertNode(root.rigth,key);

        }
        return root;
    }

    public void preOrder(Node root) {
        System.out.print(root.data+" --> ");
        if(root.left != null){
            preOrder(root.left);
        }

        if(root.rigth != null){
            preOrder(root.rigth);
        }

    }


    public void search(Node root, int key) {

        if(root != null) {
            if (root.data == key) {
                System.out.println("Found");
            }

            if (root.data > key) {
                search(root.left, key);
            }
            if (root.data < key) {
                search(root.rigth, key);
            }
        }else {
            System.out.println("Not Found");
        }
    }

    public Node remove(Node root, int key) {

            if (root.data > key) {
                root.left=remove(root.left, key);
            } else if (root.data < key) {
               root.rigth= remove(root.rigth, key);
            }else {
                //Case 0: 0 child
                if (root.left == null && root.rigth == null) {
                    return null;
                }
                //Case 1: 1 right child
                else if (root.left == null) {
                    return root.rigth;
                }
                //Case 2: 1 left child
                else if (root.rigth == null ) {
                    return root.left;
                }
                //Case 2:both child
                else {
                    Node temp=root.left;
                    while (temp.rigth != null) {
                        temp=temp.rigth;
                    }
                    root.data=temp.data;
                    root.left=remove(root.left,temp.data);

                }
            }
        return root;
    }


    // Compute the "height" of a tree
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.rigth);
            return Math.max(lh ,rh)+1;

        }
    }


}
