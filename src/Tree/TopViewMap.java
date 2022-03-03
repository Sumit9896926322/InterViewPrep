package Tree;
import java.util.*;

public class TopViewMap {
    static ArrayList<Integer> ans = new ArrayList<Integer>();

    static class NodeHeight {
        Node node;
        int height;

        NodeHeight(Node temp, int height) {
            node = temp;
            this.height = height;
        }

    }
        //Function to return a list of nodes visible from the top view
        //from left to right in Binary Tree.
        static ArrayList<Integer> topView(Node root)
        {
            if (root == null)
                return ans ;

            TreeMap<Integer, Integer> hash =
                    new TreeMap<Integer,Integer>();
            Queue<NodeHeight> q = new LinkedList<NodeHeight>();

            NodeHeight temp = new NodeHeight(root, 0);
            q.add(temp);

            while (!q.isEmpty()) {
                NodeHeight curr = q.poll();

                if (!hash.containsKey(curr.height)) {
                    hash.put(curr.height,curr.node.data);
                }
                //Add for bottom view
//                else{
//                    hash.put(curr.height,curr.node.data);
//                }
                if (curr.node.left != null)
                    q.add(new NodeHeight(curr.node.left, curr.height - 1));

                if (curr.node.right != null)
                    q.add(new NodeHeight(curr.node.right, curr.height + 1));

            }

            for (Map.Entry<Integer, Integer> elem : hash.entrySet()) {
                for (int i = 0; i < 1; i++)
                    ans.add(elem.getValue());
            }
            return ans;
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
        ArrayList<Integer> ans = topView(root);
        System.out.println(ans);
    }
}
