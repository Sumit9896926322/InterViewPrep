package graph;
import java.util.*;


public class detectCycleinDirected {
    // Function to detect cycle in a directed graph.
    static boolean[] visited;
    static boolean[] dfsVisited;
    static ArrayList<ArrayList<Integer>> adjList;
    static boolean ans = false;

    public static boolean detectCycleDirectedDFS(int v) {
        visited[v] = true;
        dfsVisited[v] = true;
        ArrayList<Integer> adjacents = adjList.get(v);
        for (int adj : adjacents) {
            if (!visited[adj]) {
                if (detectCycleDirectedDFS(adj)) {
                    return true;
                }
            } else if (visited[adj] && dfsVisited[adj]) {
                return true;
            }

        }
        dfsVisited[v] = false;
        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        adjList = adj;
        visited = new boolean[V];
        dfsVisited = new boolean[V];

        boolean ans = false;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                ans = detectCycleDirectedDFS(i);
                if (ans)
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}

