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

    // Function to find max value in the subtree
   public int maxValue(Node node) {
        if (node == null) return Integer.MIN_VALUE;
        return Math.max(node.data, Math.max(maxValue(node.left), maxValue(node.rigth)));
    }

    // Function to find min value in the subtree
   public int minValue(Node node) {
        if (node == null) return Integer.MAX_VALUE;
        return Math.min(node.data, Math.min(minValue(node.left), minValue(node.rigth)));
    }

    public int maxDepth(Node node) {
        if (node == null)
            return 0;

        // compute the depth of left and right subtrees
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.rigth);

        return Math.max(lDepth, rDepth) + 1;
    }


    /* Function to calculate the minimum depth of the tree */
    int minDepth(Node root)
    {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.rigth);

        // Base case : Leaf Node. This accounts for height = 1.
        if (root.left == null && root.rigth == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return rightDepth + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.rigth == null)
            return leftDepth + 1;

        return Math.min(leftDepth,rightDepth) + 1;
    }


    // function to return the root of inverted tree
    public Node mirror(Node root) {
        if (root == null)
            return null;

        // Invert the left and right subtree
        Node left = mirror(root.left);
        Node right = mirror(root.rigth);

        // Swap the left and right subtree
        root.left = right;
        root.rigth = left;
        return root;
    }




}