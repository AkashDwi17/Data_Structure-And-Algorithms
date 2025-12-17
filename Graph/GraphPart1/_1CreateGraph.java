package Graph.GraphPart1;
import java.util.*;

public class _1CreateGraph {
    public static class Edge {
        int src;
        int dest;
        int wt;
        public Edge (int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    } 

    public static void createGraph (ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add (new Edge(0, 1, 1));
        graph[0].add (new Edge(0, 2, 1));
        graph[1].add (new Edge(1, 0, 1));
        graph[1].add (new Edge(1, 3, 1));

        for (int i=0; i<graph[1].size(); i++){
            Edge e = graph[1].get(i);
            System.out.println (e.dest);
        }
    }
    public static void main (String args[]){
        int v = 5;
        ArrayList<Edge> graph [] = new ArrayList[v];
        createGraph(graph);
    }
}
