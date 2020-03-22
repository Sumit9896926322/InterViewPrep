package DS_ALGO;
import java.util.*;

class TreeTraversal {
	int parent;
	TreeTraversal left,right;
	TreeTraversal(int item){
		parent = item;
		left = null;
		right = null;
	}
	public static void preOrder(TreeTraversal head) {
		if(head == null)
			return;
		
		System.out.print(head.parent+" ");
		preOrder(head.left);
		preOrder(head.right);
		
	}
	
	public static void postOrder(TreeTraversal head) {
	
		if(head == null)
			return;
		postOrder(head.left);
		postOrder(head.right);
		System.out.print(head.parent+" ");
		
	}
	
	public static void inOrder(TreeTraversal head) {
		
		if(head == null)
			return;
		inOrder(head.left);
		System.out.print(head.parent+" ");
		inOrder(head.right);
		
	}
    public static void main(String args[] ) throws Exception {
        TreeTraversal t1 = new TreeTraversal(5);
        TreeTraversal t2 = new TreeTraversal(1);
        TreeTraversal t3 = new TreeTraversal(2);
        TreeTraversal t4 = new TreeTraversal(3);
        TreeTraversal t5 = new TreeTraversal(4);
        TreeTraversal t6 = new TreeTraversal(6);
        TreeTraversal t7 = new TreeTraversal(7);
        
        TreeTraversal t8 = new TreeTraversal(10);
        TreeTraversal t9 = new TreeTraversal(11);
        
        t1.left = t2;
        t1.right = t3;
        
        t2.left =t4;
        t2.right = t5;
        
        t3.left =t6;
        t3.right = t7;
        
        t4.left= t8;
        t4.right = t9;
        
        
        System.out.print("InOrder");
        inOrder(t1);
        
        
        System.out.println();
        System.out.print("preOrder");
        preOrder(t1);
        System.out.println();
        System.out.print("postOrder");
        postOrder(t1);
        System.out.println();
        
        

    }
}
