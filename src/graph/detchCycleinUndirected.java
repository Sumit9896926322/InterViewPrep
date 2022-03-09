package graph;
import java.util.*;

public class detchCycleinUndirected {
    static boolean []visited;
    static ArrayList<ArrayList<Integer>> adjList;
    static boolean ans = false;
    public static class Pair{
        int vertex;
        int parent;

        public Pair(int vertex, int parent) {
            this.vertex = vertex;
            this.parent = parent;
        }
    }
    public static boolean checkCycleDFS(int v,int parent){
        visited[v] = true;
        ArrayList<Integer> adjacents = adjList.get(v);
        for(int adj:adjacents){
            if(!visited[adj]){
                if(checkCycleDFS(adj,v)){
                    return true;
                }
            }else if(adj!= parent){
                return true;
            }

        }
        return false;
    }
    public static boolean checkCycleBFS(int v){
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(v,-1));
        visited[v] = true;
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int vertex = p.vertex;
            int parent =p.parent;
            for(int a:adjList.get(vertex)){
                if(!visited[a]) {
                    queue.add(new Pair(a,vertex));
                    visited[a] = true;
                }else if(a != parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        adjList = adj;
        visited = new boolean[V];

        boolean ans = false;

        for(int i = 0;i<V;i++){
            if(!visited[i]){
                ans =  checkCycleDFS(i,0);
                if(ans)
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        adjList = Graph.init(v,e);
        visited = new boolean[v];

        System.out.println(isCycle(v,adjList));
    }

}
