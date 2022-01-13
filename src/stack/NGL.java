package stack;

import java.util.Scanner;
import java.util.Stack;

public class NGL {

    public static long[] NGL(long arr[],int n){
        Stack<Long> st  = new Stack<Long>();
        st.push(arr[0]);
        long[] ans = new long[n];
        ans[0] = -1;
        for(int i = 1;i<n;i++){
            // if st has great element the push the arr element else pop until the stack is empty or the bigger element found in stack
            if(arr[i] < st.peek()){
                ans[i] = st.peek();
            }else{
                while(!st.isEmpty() && arr[i] >= st.peek()) {
                    st.pop();
                }
                ans[i] = st.isEmpty()?-1:st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextLong();
            }
            long ans[] = NGL(arr,n);
            for(long a:ans)
                System.out.println(a);
        }
    }
}
