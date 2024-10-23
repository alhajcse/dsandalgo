import java.util.Stack;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add_left_child(Node root,Node child){
        root.left=child;
    }

    public void add_rigth_child(Node root,Node child){
        root.rigth=child;
    }

    public Node createNode(int item){

        Node node=new Node(item);
        node.left=null;
        node.rigth=null;
        return node;
    }


    public Node createTree(){

        Node node2=createNode(2);

        Node node7=createNode(7);
        Node node9=createNode(9);
        add_left_child(node2,node7);
        add_rigth_child(node2,node9);

        Node node1=createNode(1);
        Node node6=createNode(6);
        add_left_child(node7,node1);
        add_rigth_child(node7,node6);

        Node node8=createNode(8);
        add_rigth_child(node9,node8);

        Node node5=createNode(5);
        Node node10=createNode(10);
        add_left_child(node6,node5);
        add_rigth_child(node6,node10);

        Node node3=createNode(3);
        Node node4=createNode(4);
        add_left_child(node8,node3);
        add_rigth_child(node8,node4);

        return node2;
    }

    public void traversePreOrder(Node node) {
        System.out.print(" " + node.data);
        if (node.left != null)
            traversePreOrder(node.left);

        if (node.rigth != null)
            traversePreOrder(node.rigth);
    }


    public void traversePostOrder(Node node) {
        if (node.left != null)
            traversePostOrder(node.left);

        if (node.rigth != null)
            traversePostOrder(node.rigth);
        System.out.print(" " + node.data);

    }


    public void traverseInOrder(Node node) {
        if (node.left != null)
            traverseInOrder(node.left);

        System.out.print(" " + node.data);

        if (node.rigth != null)
            traverseInOrder(node.rigth);

    }

   public int maxDepth(Node node) {
        if (node == null)
            return 0;

        // compute the depth of left and right subtrees
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.rigth);

        return Math.max(lDepth, rDepth) + 1;
    }


    public void traverseInOrderByIterative(Node node) {
        Stack<Node> stack=new Stack<>();
        Node current=node;
        while (current!=null || !stack.isEmpty()){

            // Visit the leftmost node
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            // Current must be null at this point, pop the stack
            current=stack.pop();
            System.out.print(current.data+" -> ");

            // Visit the right subtree
            current=current.rigth;
        }
    }


    public void traversePreOrderByIterative(Node node) {
        Stack<Node> stack=new Stack<>();
        Node current=node;
        stack.push(current);
        while (!stack.isEmpty()){
            // Current must be null at this point, pop the stack
            current=stack.pop();
            System.out.print(current.data+" -> ");
            // Visit the left subtree
            Node right=current.rigth;
            if(right!=null)
                stack.push(right);
            // Visit the left subtree
            Node left=current.left;
            if(left!=null)
                stack.push(left);
            current=left;
        }
    }

    public void traversePostOrderByIterative(Node node) {
        Stack<Node> stack=new Stack<>();
        Node current=node;
        stack.push(current);

        while (!stack.isEmpty()){
            // Visit the left subtree
            Node right=current.rigth;
            if(right!=null)
                stack.push(right);

            // Visit the left subtree
            Node left=current.left;
            if(left!=null)
                stack.push(left);

            // Current must be null at this point, pop the stack
            current=stack.pop();
            System.out.print(current.data+" -> ");

            current=right;
        }
    }

}
