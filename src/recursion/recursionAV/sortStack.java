package recursion.recursionAV;
import java.util.*;

public class sortStack {
   
	static Stack<Integer> st = new Stack<Integer>();
	
	public static Stack<Integer> sortRecursive(Stack<Integer> st) {
		
		if(st.size() == 1) 
			return st;
		int temp = st.pop();
		sortRecursive(st);	
		
		Stack<Integer> st2 = new Stack<Integer>();
		while(!st.isEmpty() && temp < st.peek()) {
			st2.push(st.pop());
		}
		st.push(temp);
		while(!st2.isEmpty()) {
			st.push(st2.pop());
		}	
		return st;
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int t = 1;
		t = s.nextInt();
		
		while(t-- > 0) {
			st = new Stack<Integer>();
			int n = s.nextInt();
			
		for (int i = 0; i < n; i++) 
			st.push(s.nextInt());
		
		
			
	
			System.out.println(	sortRecursive(st));
		}
  }
}
