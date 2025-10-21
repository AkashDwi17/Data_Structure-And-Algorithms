package BinaryTree;


public class _3DiameterOfTree {

    // Node class
    public static class Node {
        int data;
        Node left;
        Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

    // Diameter of tree
    public static class Info {
        int diam;
        int ht;
        public Info (int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter (Node root){
        if (root == null){
            return new Info (0,0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max (leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    // Example usage
    public static void main(String[] args){
        // Manually creating the same tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4  5  6  7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Info treeInfo = diameter(root);
        System.out.println("Height of tree: " + treeInfo.ht);
        System.out.println("Diameter of tree: " + treeInfo.diam);
    }
}
