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

    public static Node insert (Node root, int val){
        if (root == null){
            root = new Node (val);
            return root;
        }
        if (root.data > val){
            root.left = insert (root.left, val);
        }
        else{
            root.right = insert (root.right, val);
        }
        return root;
    }

    public static boolean search (Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if (root.data > key){
            return search (root.left, key);
        }else{
            return search (root.right, key);
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

    public static Node deleteNode (Node root, int val){
        if (root == null){
            return null;
        }
        if (root.data > val){
            root.left = deleteNode (root.left, val);
        }
        else if (root.data < val){
            root.right = deleteNode (root.right, val);
        }
        else{
            if (root.left == null && root.right == null){
                return null;
            }   
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            Node IS = findInOrderSuscessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        
        return root;
    }

    

    public static Node findInOrderSuscessor (Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

        public static void main (String args[]){
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
