/*Tree Traversal Without Recursion*/
package DS_ALGO;
import DS_ALGO.TreeTraversal;
import java.util.*;


public class TTraversal {
	static Stack<TreeTraversal> st = new Stack<TreeTraversal>();
	static Queue<TreeTraversal> q = new PriorityQueue<TreeTraversal>();
 public static TreeTraversal makeTree() {
	 TreeTraversal t1 = new TreeTraversal(3);
     TreeTraversal t2 = new TreeTraversal(1);
     TreeTraversal t3 = new TreeTraversal(8);
     TreeTraversal t4 = new TreeTraversal(3);
     TreeTraversal t5 = new TreeTraversal(4);
     TreeTraversal t6 = new TreeTraversal(6);
     TreeTraversal t7 = new TreeTraversal(7);
     TreeTraversal t8 = new TreeTraversal(8);
     TreeTraversal t9 = new TreeTraversal(9);
     TreeTraversal t10 = new TreeTraversal(10);
     
     t1.right = t3;
     t1.left= t2;
     
     t3.left = t5;
     t3.right = t9;
     
     t9.right=t10;
    
     return t1;
 }	
 public static void LevelOrder(TreeTraversal data){ 
	 Queue<TreeTraversal> q = new LinkedList<TreeTraversal>();
	 while(data != null || !q.isEmpty()){
		 System.out.println(data.parent);
		 if(data.left!=null) {
			 q.add(data.left);
		     System.out.println("/");
		 }
		 if(data.right!=null) {
			 q.add(data.right);
		    System.out.println("");
		 }
		 data = q.poll(); 
	 }
		 
 }
 public static void Insert(TreeTraversal data,int element) {
	 Stack<TreeTraversal> st = new Stack<TreeTraversal>();
	 TreeTraversal root = data;
	 while(data!=null) {
		 if(element < data.parent)
			 data = data.left;
		 else
			 data = data.right;
		 
		if(data!= null) st.push(data);
	 }
	 TreeTraversal last = st.pop();
	 TreeTraversal tnew = new TreeTraversal(element);
	 
	  if(last.parent < element) 
		  last.left = tnew;
	  else
		  last.right = tnew;
	 preOrder(root);
 }
 public static void InOrder(TreeTraversal data){ 
	int temp=0,level= 0;
	 while(data != null || !st.empty()){
	 while(data != null) {
		 st.push(data);
		 data = data.left;
		 temp = temp+1;
	 }
	 
	 data = st.pop();
//   Reducing when reach to parent
	 if(data!= null) temp-=1;
//	
	 System.out.println(data.parent+" "+temp);
	 data = data.right;
	 if(data!= null) temp+=1;
	 if(temp > level)level = temp;
	 }
	 System.out.println(level);
	 
		 
 }
 public static void preOrder(TreeTraversal data){ 
		
	 while(data != null || !st.empty()){
	 while(data != null) {
		 System.out.print(data.parent+" ");
		 st.push(data);
		 data = data.left; 
	 }
	 data = st.pop();
	
	 data = data.right;
	 }
		 
 }
 public static void postOrder(TreeTraversal data){ 
		int temp =0,level=0;
	 while(data != null || !st.empty()){
		
	 while(data != null) { 
		 st.push(data);
		 data = data.left; 
	 }
	 data = st.pop();
	 data = data.right;
	 }
		 
 }
 
 public static void main(String args[]){
	TreeTraversal head = makeTree(); 
//	InOrder(head);
//	preOrder(head);
//	LevelOrder(head);
    Insert(head,7);
 }
 
}
