package recursion;
import java.util.*;

public class deleteMidStack {
   
	static Stack<Integer> st = new Stack<Integer>();
	static int size;
	public static Stack<Integer> deleteMid(Stack<Integer> st) {
		
		if(st.size() == 0) {
			st.pop();
			return st;
		
		}
		int temp = st.pop();
		deleteMid(st);	
		st.push(temp);
		
		return st;
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int t = 1;
		t = s.nextInt();
		
		while(t-- > 0) {
			st = new Stack<Integer>();
			int n = s.nextInt();
			size = n/2+1;
		for (int i = 0; i < n; i++) 
			st.push(s.nextInt());
		
	
			System.out.println(	deleteMid(st));
		}
  }
}
