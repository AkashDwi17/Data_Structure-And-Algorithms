package BinaryTree;

public class _4subTreeOfAnotherTree {
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
        // Main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is Subtree: " + isSubTree(root, subRoot)); // true
    }
}
