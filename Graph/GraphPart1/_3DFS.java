package Graph.GraphPart1;
import java.util.*;

import Graph.GraphPart1._1CreateGraph.Edge;

public class _3DFS {
    
    // DFS
    public static void dfs (ArrayList<Edge> graph[], boolean vis[], int curr){
        System.out.print (curr+" ");
        vis[curr] = true;
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }
}
