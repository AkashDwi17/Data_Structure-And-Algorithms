package BinarySearchTree;

public class _2SerchInBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert (Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
       
        if (root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean serchInBST(Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if (root.data < key){
            return serchInBST (root.right, key);
        }
        else{
            return serchInBST(root.left, key);
        }
    }
    public static void inOrder (Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        if (serchInBST(root, 123)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
