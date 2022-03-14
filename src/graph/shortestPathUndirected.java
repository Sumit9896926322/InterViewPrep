package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class shortestPathUndirected {
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
    static boolean []visited;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        adjList = Graph.init(v,e);
        visited = new boolean[v];
    }

}
