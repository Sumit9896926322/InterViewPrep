package graph;
import java.util.*;
public class checkBiPartite {
        static int[] colors;
        static ArrayList<ArrayList<Integer>> adjList;
        static boolean ans = false;

        public static boolean checkBipartiteDFS(int v,int color){
            colors[v] = color;
            ArrayList<Integer> adjacents = adjList.get(v);
            for(int adj:adjacents){
                if(colors[adj] == -1){
                    int revColor = color == 1?0:1;
                    boolean ans = checkBipartiteDFS(adj,revColor);
                    if(!ans){
                        return ans;
                    }
                }else if(colors[adj] == colors[v]){
                    return false;
                }

            }
            return true;
        }

        public static boolean checkBipartiteBFS(int v,int color){
            Queue<Integer> queue = new LinkedList<Integer>();
            colors[v] = color;
            queue.add(v);
            while(!queue.isEmpty()){
                int vertex = queue.poll();
                for(int a:adjList.get(vertex)){
                    if(colors[a] == -1) {
                        int revColor = colors[vertex] == 1?0:1;
                        queue.add(a);
                        colors[a] = revColor;
                    }else if(colors[a] == colors[vertex]){
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
        {
            adjList = adj;
            colors = new int[V];
            Arrays.fill(colors,-1);

            boolean ans = false;

            for(int i = 0;i<V;i++){
                if(colors[i] == -1){
                    ans =  checkBipartiteBFS(i,0);
                    if(!ans){
                        return false;
                    }
                }
            }
            return ans;
        }


    public static void main(String[] args) {

    }
}
