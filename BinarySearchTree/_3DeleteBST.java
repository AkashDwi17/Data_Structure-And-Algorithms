package BinarySearchTree;

public class _3DeleteBST {

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

    // Insert function (for testing)
    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Delete a node from BST
    public static Node deleteNode(Node root, int val){
        if (root == null) return null;

        if (root.data < val){
            root.right = deleteNode(root.right, val);
        } 
        else if (root.data > val){
            root.left = deleteNode(root.left, val);
        } 
        else {
            // Case 1: Leaf node
            if (root.left == null && root.right == null){
                return null;
            }

            // Case 2: One child
            if (root.left == null){
                return root.right;
            } 
            else if (root.right == null){
                return root.left;
            }

            // Case 3: Two children
            Node IS = findInOrderSucc(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    // Find inorder successor (smallest value in right subtree)
    public static Node findInOrderSucc(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    // Inorder traversal
    public static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int val : values){
            root = insert(root, val);
        }

        System.out.print("Inorder before deletion: ");
        inOrder(root);
        System.out.println();

        root = deleteNode(root, 3); // delete node with value 3

        System.out.print("Inorder after deletion: ");
        inOrder(root);
        System.out.println();
    }
}
