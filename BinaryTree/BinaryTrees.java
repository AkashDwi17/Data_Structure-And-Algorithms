package BinaryTree;

import java.util.*;
public class BinaryTrees {
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
    public static class BinaryTree{
        static int idx = -1;
        public static Node buildTree (int nodes[]){
            idx ++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node (nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // preorder
    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print (root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder
    public static void inOrder (Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print (root.data+" ");
        inOrder(root.right);
    }

    // PostOrder
    public static void postOrder (Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print (root.data+" ");
    }

    // levelOrder
    public static void levelOrder (Node root){
        if (root == null){
            return;
        }
        Queue <Node> q = new LinkedList<>(); 
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
                System.out.print (currNode.data+" ");
                if (currNode.left != null){
                    q.add (currNode.left);
                }
                if (currNode.right != null){
                    q.add (currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.print (root.data);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Pre Order Traversal:");
        preOrder(root);
        System.out.println();

        System.out.println("In Order Traversal:");
        inOrder(root);
        System.out.println();

        System.out.println("Post Order Traversal:");
        postOrder(root);
        System.out.println();

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}