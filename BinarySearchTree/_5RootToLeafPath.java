package BinarySearchTree;

import java.util.ArrayList;

public class _5RootToLeafPath {
    //Root To Leaf Path

    public static void printPath (ArrayList<Integer> path){

        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("null");
    }
    public static void printRoot2Leaf (Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add (root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove (path.size()-1);
    }
        public static void main (String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int val : values){
            root = insert(root, val);
        }

        inOrder(root);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}

}
