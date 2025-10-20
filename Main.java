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
    // level Order Traversal
    public static void levelOrder (Node root){
            if (root == null){
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add (root);
            q.add (null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else{
                        q.add (null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
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
                return new Info (0,0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

            int ht = Math.max (leftInfo.ht, rightInfo.ht)+1;
            return new Info(diam, ht);
        }




        

        // Subtree of another tree

        public static boolean isIdentical (Node root, Node subRoot){
            if (root == null || subRoot == null){
                return true;
            }
            if (root == null || subRoot == null || root.data != subRoot.data){
                return false;
            }
            if (!isIdentical(root.left, subRoot.left)){
                return false;
            }
            if (!isIdentical(root.right, subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubTree (Node root, Node subRoot){
            if (root == null){
                return false;
            }
            if (root.data == subRoot.data){
                if (isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }
        
    public static void main (String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print (root.data);
        System.out.println();

        // _______________________________________________________________________
        // _______________________________________________________________________

        System.out.println();
    }
}