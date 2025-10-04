import java.util.*;
import java.math.BigInteger;
import java.util.stream.Collectors;

public class UsefulTricks {

    public static void main(String[] args) {

        // ===================== 1. ARRAYS =====================
        int[] arr = {5, 2, 8, 1};

        // 1.1 Sort
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // [1,2,5,8]

        // 1.2 Binary Search
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index); // 2

        // 1.3 Fill
        Arrays.fill(arr, 3);
        System.out.println("Filled array: " + Arrays.toString(arr)); // [3,3,3,3]

        // 1.4 Copy
        int[] copy = Arrays.copyOf(arr, 6);
        System.out.println("Copied array: " + Arrays.toString(copy)); // [3,3,3,3,0,0]

        // ===================== 2. STRINGS =====================
        String s = "hello world";

        // 2.1 Character at position
        System.out.println("Char at 0: " + s.charAt(0)); // h

        // 2.2 Substring
        System.out.println("Substring: " + s.substring(0,5)); // hello

        // 2.3 Contains
        System.out.println("Contains 'world': " + s.contains("world")); // true

        // 2.4 Replace
        System.out.println("Replace 'l' with 'x': " + s.replace("l","x")); // hexxo worxd

        // ===================== 3. ARRAYLIST =====================
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        System.out.println("Get index 1: " + list.get(1)); // 10
        list.remove(0);
        System.out.println("After remove: " + list); // [10]

        // ===================== 4. HASHMAP =====================
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 10);
        map.putIfAbsent("b", 20);
        System.out.println("Value of a: " + map.get("a")); // 10
        map.merge("a", 5, Integer::sum);
        System.out.println("After merge: " + map); // {a=15, b=20}

        // ===================== 5. STACK / QUEUE =====================
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        System.out.println("Stack pop: " + stack.pop()); // 100

        Queue<Integer> queue = new LinkedList<>();
        queue.add(50);
        System.out.println("Queue poll: " + queue.poll()); // 50

        // ===================== 6. PRIORITYQUEUE =====================
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue poll: " + pq.poll()); // 10

        // ===================== 7. MATH / BIGINTEGER =====================
        System.out.println("Max: " + Math.max(10, 20)); // 20
        BigInteger big = new BigInteger("12345678901234567890");
        BigInteger result = big.add(BigInteger.valueOf(10));
        System.out.println("BigInteger add: " + result); // 12345678901234567900

        // ===================== 8. STREAMS =====================
        List<Integer> nums = Arrays.asList(5,2,8,1);
        System.out.print("Stream filter >2: ");
        nums.stream().filter(x -> x > 2).forEach(x -> System.out.print(x + " ")); // 5 8
        System.out.println();

        // ===================== 9. DFS (Graph) =====================
        int[][] graph = {{1,2},{0,3},{0,3},{1,2}};
        boolean[] visited = new boolean[4];
        System.out.println("DFS traversal:");
        dfs(0, graph, visited);

        // ===================== 10. BFS (Graph) =====================
        System.out.println("BFS traversal:");
        bfs(0, graph);

        // ===================== 11. SIMPLE RECURSION EXAMPLE =====================
        System.out.println("Factorial of 5: " + factorial(5)); // 120

        // ===================== 12. HASHSET =====================
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1); // duplicate ignored
        System.out.println("HashSet: " + set); // [1,2]

        // ===================== 13. TREENODE EXAMPLE =====================
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println("Tree PreOrder:");
        preorder(root);

        // ===================== 14. HEAP (MAX HEAP) =====================
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);
        System.out.println("MaxHeap poll: " + maxHeap.poll()); // 10
    }

    // ===================== DFS =====================
    static void dfs(int node, int[][] graph, boolean[] visited) {
        visited[node] = true;
        System.out.println(node);
        for(int neigh : graph[node]){
            if(!visited[neigh]) dfs(neigh, graph, visited);
        }
    }

    // ===================== BFS =====================
    static void bfs(int start, int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node);
            for(int neigh : graph[node]){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }

    // ===================== RECURSION =====================
    static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

    // ===================== TREE NODE =====================
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }

    static void preorder(TreeNode node){
        if(node == null) return;
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}