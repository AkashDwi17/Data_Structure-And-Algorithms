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

    public static class BinaryTree {
        static int idx = -1;
        public static Node buildTree (int nodes[]) {
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void levelOrderTraversal (Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add (root);
        q.add (null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println ();
                if (q.isEmpty()){
                    break;
                }
                q.add (null);
            }
            else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null){
                    q.add (currNode.left);
                }
                if (currNode.right != null){
                    q.add (currNode.right);
                }
            }
        }
    }

    // Diameter of tree
    public static class Info {
        int diam;
        int ht;
        public Info (int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter (Node root){
        if (root == null){
            return new Info (0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static void main (String args[]){
        // Manually creating the same tree:
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

        Info treeInfo = diameter(root);
        System.out.println("Height of tree: " + treeInfo.ht);
        System.out.println("Diameter of tree: " + treeInfo.diam);
    }
}
