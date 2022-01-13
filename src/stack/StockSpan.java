package stack;

import java.util.Scanner;
import java.util.Stack;

class Pair{
    int a= 0;
    int b = 0;
    Pair(int a,int b){
      this.a = a;
      this.b = b;
    }
}
public class StockSpan {

    public static long[] NGR(long arr[],int n){
        Stack<Long> st  = new Stack<Long>();
        st.push(arr[n-1]);
        long[] ans = new long[n];
        ans[n-1] = -1;
        for(int i = n-2;i>=0;i--){
            // if st has greate element the push the arr element else pop until the stack is empty or the bigger element found in stack
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
            long ans[] = NGR(arr,n);
            for(long a:ans)
                System.out.println(a);
        }
    }
}
