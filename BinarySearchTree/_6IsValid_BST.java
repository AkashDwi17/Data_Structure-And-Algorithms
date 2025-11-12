package BinarySearchTree;

public class _6IsValid_BST {
    // Valid BST
    public static boolean isValidBST (Node root, Node min, Node max){
        if (root == null){
            return true;
        }
        if (min != null && root.data <= min.data){
            return false;
        }
        if (max != null &&  root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
        public static void main (String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int val : values){
            root = insert(root, val);
        }

        inOrder(root);
        System.out.println();

        if (isValidBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
