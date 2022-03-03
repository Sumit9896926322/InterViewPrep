package Tree;
import java.util.*;

public class NodePath {
    static ArrayList<Integer> ans;
    public static boolean nodePath(Node A, int B) {
        if(A == null){
            return false;
        }

        ans.add(A.data);

        if(A.data == B){
            return true;
        }

        if(nodePath(A.left,B) || nodePath(A.right,B)){
            return true;
        }
        ans.remove(new Integer(A.data));
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree t = new Tree();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        Node root = t.makeTree(arr);

        ans = new ArrayList<Integer>();
        nodePath(root,B);
        System.out.println(ans.size()>0?ans:-1);
    }
}
