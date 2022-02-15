package misc;

import java.util.*;

public class Graph {
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
    public static void bfs(int v){
        if(adjList.size() == 0)
            return;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        Boolean visited[] = new Boolean[v-1];
        while(!queue.isEmpty()){
               int vertex = queue.poll();
               System.out.println(vertex);

               for(int a:adjList.get(vertex)){
                   if(!visited[a]) {
                       queue.add(a);
                       visited[vertex] = true;
                   }
               }
        }

    }
    // Function to return a list containing the DFS traversal of the graph.
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj,Boolean visited[],ArrayList<Integer> ans,int i) {
        // Code here

        ArrayList<Integer> adjacent = adj.get(i);
        for(int j:adjacent){
            if(!visited[j]){
                ans.add(j);
                dfs(adj,visited,ans,j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();


        for (int i = 0; i <= v; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 1; i <= e ; i++) {

            int src  = s.nextInt();
            int dest = s.nextInt();

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }

//        for (int i = 1;i<adjList.size();i++) {
//            System.out.print(i+" -> ");
//            ArrayList<Integer> neighbour = adjList.get(i);
//            for (int nodes : neighbour)
//                System.out.print(nodes + " ");
//            System.out.println();
//        }

//        bfs(v);
        Boolean visited[] = new Boolean[v+1];
        ArrayList<Integer> ans = new ArrayList<Integer>();
         dfs(adjList,visited,ans,0);
    }
}
