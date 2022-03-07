package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelOrder {
    public void levelOrder(Node root) {
        // level order traversal of tree

        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);

        }

    }

    public static void levelOrderRecursive(Node root) {
        // level order traversal of tree
        int height = Tree.Height(root);

        for(int i = 1;i<=height;i++){
            printLevel(root,i);
        }

    }
    public static void printLevel(Node root,int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data);
        }
        printLevel(root.left,level-1);
        printLevel(root.right,level-1);
    }
    public static void zigZag(Node root){
        Stack<Node> currLevel = new Stack<Node>();
        Stack<Node> nextLevel = new Stack<Node>();
        boolean rightToLeft = true;
        currLevel.push(root);
        while(!currLevel.isEmpty()){
            for(int i = 0;i<currLevel.size();i++){
                Node temp = currLevel.get(i);
                nextLevel.empty();
               System.out.println(temp.data);
                    if(rightToLeft){
                        if(temp.left != null){
                            nextLevel.push(temp.left);
                        }
                        if(temp.right != null){
                            nextLevel.push(temp.right);
                        }
                    }else{
                        if(temp.right != null){
                            nextLevel.push(temp.right);
                        }
                        if(temp.left != null){
                            nextLevel.push(temp.left);
                        }
                    }
                }
                currLevel.clear();
                while(!nextLevel.isEmpty()){
                    currLevel.add(nextLevel.pop());
                }
                rightToLeft = !rightToLeft;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Node root = Tree.makeTree(arr);
    //        levelOrderRecursive(root);
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 1;i<=5;i++){
            st.push(i);
        }

        zigZag(root);
    }
}
