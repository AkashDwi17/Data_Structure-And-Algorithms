package BinaryTree;

public class _10TransformToSumTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int transformToSumTree(Node root){
        if (root == null){
            return 0;
        }
        
        int leftChild = transformToSumTree(root.left);
        int rightChild = transformToSumTree(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

// ===================================  Second Method  ==============================
    // Kth Anchestor 
    public static int kthAnchestor2 (Node root, int n, int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }

        int leftInfo = kthAnchestor2(root.left, n, k);
        int rightInfo = kthAnchestor2(root.right, n, k);

        if (leftInfo == -1 && rightInfo == -1){
            return -1;
        }
        int max = Math.max (leftInfo, rightInfo);
        if (max+1 == k){
            System.out.println(root.data+"  ");
        }
        return max+1;
    }

    // ===========================================================================
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
  
        System.out.println(transformToSumTree(root));
        preOrder(root);
    }
}



       