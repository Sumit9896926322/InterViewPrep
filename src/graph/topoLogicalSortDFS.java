package graph;
import java.util.*;

public class topoLogicalSortDFS {
    static boolean []visited;
    static ArrayList<ArrayList<Integer>> adjList;
    static Stack<Integer> st;
    public static void topSortDFS(int v){
        visited[v] = true;
        st.push(v);
        ArrayList<Integer> adjacents = adjList.get(v);
        for(int adj:adjacents){
            if(!visited[adj]){
                topSortDFS(adj);
            }

        }
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        adjList = adj;
        visited = new boolean[V];
        st= new Stack<Integer>();

        for(int i = 0;i<V;i++){
            if(!visited[i]){
                topSortDFS(i);
            }
        }

        int ans[] = new int[V];
        for(int i = 0;i<ans.length;i++){
            ans[i] = st.pop();
            // System.out.println(ans[i]+"s");
        }
        return ans;
    }

    public static void main(String[] args) {
        //pass the vertex and adjList
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        adjList = Graph.init(v,e);
        visited = new boolean[v];

    }
}
