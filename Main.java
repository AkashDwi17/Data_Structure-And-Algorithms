import java.util.*;
public class Main {
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

    public static Node createBST (int arr[], int st, int end){
        if(st > end){
            return null;
        }
        int mid = (end-st)/2;
        Node root = new Node (arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void main (String args[]){
        
    }
}