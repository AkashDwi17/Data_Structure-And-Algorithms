package Graph.GraphPart1;
import java.util.*;

public class _2BFS {
    // _1CreateGraph createGraph = new _1CreateGraph();

    public static void bfs (ArrayList<_1CreateGraph.Edge> graph[]){
        Queue <Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add (0);

        while (!q.isEmpty()){
            int curr = q.remove();

            if (!vis[curr]){
                System.out.print (curr+" ");
                vis[curr] = true;

                for (int i=0; i<graph[curr].size(); i++){
                    _1CreateGraph.Edge e = graph[curr].get(i);
                    q.add (e.dest);
                }
            }
        }
    }
    
}
