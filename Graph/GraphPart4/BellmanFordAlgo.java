package Graph.GraphPart4;
import java.util.*;

public class BellmanFordAlgo {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph (ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
        // for (int i=0; i<graph[1].size(); i++){
        //     Edge e = graph[1].get(i);
        //     System.out.println (e.dest);
        // }
    }

    public static void bellmanFord (ArrayList<Edge> graph[], int src){
        int dist[] = new int [graph.length];
        for (int i=0; i<graph.length; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i=0; i<graph.length-1; i++){
            for (int j=0; j<graph.length; j++){
                for (int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if (dist[u] != Integer.MAX_VALUE && dist[u]+w < dist[v]){
                        dist[v] = dist[u]+w;
                    }
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print (dist[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bellmanFord(graph, 0);  // source = 0
        
    }
}
