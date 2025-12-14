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

    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print (root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void levelOrder (Node root){
        if (root == null){
            return;
        }
        Queue <Node> q = new LinkedList<>();
        q.add (root);
        q.add (null);

        while (!q.isEmpty()){
            Node currNode  = q.remove();
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

    // Diameter of Tree 
    public static class Info1 {
        int diam;
        int ht;
        public Info1 (int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info1 diameter (Node root){
        if (root == null){
            return new Info1(0, 0);
        }
        Info1 leftInfo1 = diameter(root.left);
        Info1 rightInfo1 = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo1.diam, rightInfo1.diam), leftInfo1.ht + rightInfo1.ht + 1);
        int ht = Math.max (leftInfo1.ht, rightInfo1.ht)+1;
        return new Info1 (diam, ht);
    }

    // Is subtree of another tree
    public static boolean isIdentical (Node root, Node subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        return isIdentical (root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    public static boolean isSubTree (Node root, Node subRoot){
        if (root == null){
            return false;
        }
        
        if (isIdentical(root, subRoot)){
            return true;
        }
        return isSubTree (root.left, subRoot) || isSubTree (root.right, subRoot);
    }


    // Top View Of tree
    public static class Info{
        Node node;
        int hd;
        public Info (Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView (Node root){
        HashMap <Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();

        int min = 0;
        int max = 0;

        q.add (new Info (root, 0));
        q.add (null);

        while (!q.isEmpty()){
            Info curr = q.remove();
            if (curr == null){
                if (q.isEmpty()){
                    break;
                }
                q.add (null);
            }else{
                if (!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null){
                    q.add (new Info (curr.node.left, curr.hd-1));
                    min = Math.min (min, curr.hd-1);
                }
                if (curr.node.right != null){
                    q.add (new Info (curr.node.right, curr.hd+1));
                    max = Math.max (max, curr.hd+1);
                }
            }
        }
        for (int i=min; i<=max; i++){
            System.out.print (map.get(i).data+" ");
        }
        System.out.println ();
    }

    // Transform to sum tree 

    public static int transFormTOSumTree (Node root){
        if (root == null){
            return 0;
        }
        int leftChild = transFormTOSumTree(root.left);
        int rightChild = transFormTOSumTree(root.right);

        int data = root.data;

        root.data = leftChild + rightChild;

        return data + leftChild + rightChild;
    }

    public static void kthLevel (Node root, int level, int k){
        if (k == level){
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }

    public static Node lca5 (Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca5 (root.left, n1, n2);
        Node rightLca = lca5 (root.right, n1, n2);

        if (leftLca == null){
            return rightLca;
        }
        if (rightLca == null){
            return  leftLca;
        }
        return root;
    }

    public static Node lca (Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftInfo = lca (root.left, n1, n2);
        Node rightInfo = lca (root.right, n1, n2);

        if (leftInfo == null){
            return rightInfo;
        }
        if (rightInfo == null){
            return leftInfo;
        }
        return root;
    }
    
    // Kth Anchestor 
    public static int kthAnchestor (Node root, int n, int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }

        int leftInfo = kthAnchestor(root.left, n, k);
        int rightInfo = kthAnchestor(root.right, n, k);

        if (leftInfo == -1 && rightInfo == -1){
            return -1;
        }
        int max = Math.max (leftInfo, rightInfo);
        if (max+1 == k){
            System.out.println(root.data+"  ");
        }
        return max+1;
    }
    
    public static void main (String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right = new Node (3);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        topView(root);
    }
}
