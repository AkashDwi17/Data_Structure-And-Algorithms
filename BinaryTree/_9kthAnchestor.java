package BinaryTree;

public class _9kthAnchestor {
    public static int kthAnchestor (Node root, int n, int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDist = kthAnchestor(root.left, n, k);
        int rightDist = kthAnchestor(root.right, n, k);
        
        if (leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max+1 == k){
            System.out.println(root.data);
        }
        return max + 1;
    }
    public static void main(String[] args) {
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
        kthAnchestor(root, 5, 1);
        kthAnchestor(root, 5, 2);
    }
}
