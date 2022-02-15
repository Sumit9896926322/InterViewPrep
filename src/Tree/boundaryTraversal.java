package Tree;

import java.util.ArrayList;

public class boundaryTraversal {

        static ArrayList<Integer> ans;
        public static void leftPath(Node root){
            if(root == null)
                return;
            if(root.left == null && root.right == null){
                return;
            }
            ans.add(root.data);
            if(root.left == null)
                leftPath(root.right);
            else
                leftPath(root.left);
        }
        public static void rightPath(Node root){
            if(root == null)
                return;
            if(root.left == null && root.right == null){
                return;
            }


            if(root.right == null)
                rightPath(root.left);
            else
                rightPath(root.right);
            ans.add(root.data);
        }
        public static void leafNodes(Node root){
            if(root == null)
                return;
            if(root.left == null && root.right == null){
                ans.add(root.data);
            }

            leafNodes(root.left);
            leafNodes(root.right);
        }
        public static ArrayList<Integer> boundary(Node node)
        {
            if(node == null)
                return new ArrayList<Integer>();

            ans = new ArrayList<Integer>();
            ans.add(node.data);
            if(node.left ==null && node.right == null)
                return ans;
            leftPath(node.left);
            leafNodes(node);
            rightPath(node.right);
            return ans;
        }

    public static void main(String[] args) {
//            boundary(node);
    }
}
