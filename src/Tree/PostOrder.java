package Tree;

import java.util.HashMap;
import java.util.Stack;

public class PostOrder {
    public static void BottomView(Node curr,int level,HashMap<Node,Integer> hm) {
     if(curr == null){
         return;
     }
     hm.put(curr,level);
     BottomView(curr.left,level-1,hm);
     BottomView(curr.right,level+1,hm);
    }
    public static void main(String[] args) {

    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
