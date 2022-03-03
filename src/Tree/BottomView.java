package Tree;
import java.util.*;

public class BottomView {
    static TreeMap<Integer,Pair> hm;
    public static void TopView(Node curr,int level,int height,TreeMap<Integer,Pair> hm) {
        if(curr == null){
            return;
        }

        if(hm.containsKey(level)){
            Pair temp = hm.get(level);
            if(height >= temp.height){
                hm.put(level,new Pair(curr.data,height));
            }
        }else{
            hm.put(level,new Pair(curr.data,height));
        }

        TopView(curr.left,level-1,height+1,hm);
        TopView(curr.right,level+1,height+1,hm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree t = new Tree();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = t.makeTree(arr);
        hm = new TreeMap<Integer,Pair>();
        TopView(root,0,0,hm);

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer,Pair>m:hm.entrySet())
            ans.add(m.getValue().data);

        System.out.println(ans);
    }
}
