package stack;

import java.util.Scanner;
import java.util.Stack;

class Pair{
    long elem= 0;
    int count = 0;
    Pair(long a,int b){
      this.elem = a;
      this.count = b;
    }
}
public class StockSpan {

    public static long[] stockSpan(long arr[],int n){
        Stack<Pair> st  = new Stack<Pair>();
        st.push(new Pair(arr[0],1));
        long[] ans = new long[n];
        ans[0] = 1;
        for(int i = 1;i<=n-1;i++){
            int counter = 1;
            // if st has greater stock price the push the current stock else pop until the stack is empty or the bigger stock price found in stack
            if(arr[i] < st.peek().elem){
                ans[i] = 1;
            }else{
                while(!st.isEmpty() && arr[i] >= st.peek().elem) {
                    Pair p = st.pop();
                    counter += p.count;
                }
                ans[i] = counter;
            }
            st.push(new Pair(arr[i],counter));
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
            long ans[] = stockSpan(arr,n);
            for(long a:ans)
                System.out.println(a);
        }
    }
}
