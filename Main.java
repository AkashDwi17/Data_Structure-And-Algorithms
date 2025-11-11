import java.util.*;
public class Main{
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

    public static int transFormToSumTree (Node root){
        if (root == null){
            return 0;
        }
        int leftChild = transFormToSumTree(root.left);
        int rightChild = transFormToSumTree(root.right);

        int data = root.data;
        int newLeft = root.left ==  null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }
    public static void main (String args[]){

    }
}