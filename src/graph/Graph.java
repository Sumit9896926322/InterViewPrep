package graph;

import java.util.*;

public class Graph {
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
    static boolean []visited;
    public static void bfs(int v){
        if(adjList.size() == 0)
            return;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;
        while(!queue.isEmpty()){
               int vertex = queue.poll();
                System.out.println(vertex);
               for(int a:adjList.get(vertex)){
                   if(!visited[a]) {
                       queue.add(a);
                       visited[a] = true;
                   }
               }
        }

    }
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int i) {
        // Code here
        visited[i] = true;
        System.out.println(i);
        ArrayList<Integer> adjacent = adjList.get(i);
        for(int j:adjacent){
            if(!visited[j]){
                dfs(j);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> init(int v,int e){
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 1; i <= e ; i++) {

            int src  = s.nextInt();
            int dest = s.nextInt();

            //in case of undirected graph adding edges to both node
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
        return adjList;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        adjList = init(v,e);
        visited = new boolean[v];
        for(int i = 0;i<v;i++){
            if(!visited[i]){
             //   bfs(i);

                dfs(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
//         dfs(adjList,visited,ans,0);
    }
}
