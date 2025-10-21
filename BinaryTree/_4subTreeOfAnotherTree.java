package BinaryTree;

public class _4subTreeOfAnotherTree {

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
    // Check if two trees are identical
    public static boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    // Check if subRoot is a subtree of root
    public static boolean isSubTree(Node root, Node subRoot){
        if (root == null){
            return false;
        }
        if (isIdentical(root, subRoot)){
            return true;
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    // Example usage
    public static void main(String[] args){

         // Manually creating the same tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4  5  6  7

        // Main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


         // Manually creating the same tree:
        //      2     
        //     / \   
        //    4  5  
        // Subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is Subtree: " + isSubTree(root, subRoot)); // true
    }
}
