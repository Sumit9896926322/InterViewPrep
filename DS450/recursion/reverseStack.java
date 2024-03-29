package recursion;
import java.util.*;

public class reverseStack {
   
	static Stack<Integer> st = new Stack<Integer>();

	public static Stack<Integer> pushAtBottom(Stack<Integer> st,int temp) {
		
		if(st.size() == 0) {
			st.push(temp);
			return st;
		}
		int tempr = st.pop();
		pushAtBottom(st,temp);	
		st.push(tempr);
		
		return st;
	}

	public static Stack<Integer> reverse(Stack<Integer> st) {
		
		if(st.size() == 0) {
			return st;
		}
		int temp = st.pop();
		reverse(st);	
		
			pushAtBottom(st,temp);
		
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
		
	
			System.out.println(	reverse(st));
		}
  }
}
