package Graph.GraphPart1;

import java.util.ArrayList;

import Graph.GraphPart1._1CreateGraph.Edge;

public class _4HasPath {
    public static boolean hasPath (ArrayList <Edge> graph[], int src, int dest, boolean vis[]){
        if (src == dest){
            return true;
        }
        vis[src] = true;
        for (int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
}
