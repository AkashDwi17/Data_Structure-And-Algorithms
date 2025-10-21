package BinaryTree;

public class _10TransformToSumTree {
    // Function to transform the tree into a Sum Tree
    public static int transformToSumTree(Node root) {
        if (root == null) {
            return 0;
        }

        // Recursively transform left and right subtrees
        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);

        // Store old value
        int oldValue = root.data;

        // Set new value = sum of left and right subtrees (old values)
        root.data = leftSum + rightSum;

        // Return total sum of the subtree (including the old value)
        return root.data + oldValue;
    }

    // Preorder traversal
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Tree:
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

        transformToSumTree(root);

        System.out.print("Preorder of Sum Tree: ");
        preOrder(root);
    }
}
