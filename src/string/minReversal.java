package string;

import java.util.*;

public class minReversal {
    public static int minReversalToBalance (String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0;i<s.length();i++){
            char elem = s.charAt(i);
            if(s.charAt(i) == '{'){
                st.push(elem);
            }else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }else{
                st.push(elem);
            }
        }

        if(st.size() %2 != 0){
            return -1;
        }else{
            int ans = 0;
            for(int i = 0;i<st.size();i+=2){
                char elem = st.get(i);
                if(elem == '}' && !st.isEmpty() && st.get(i+1)== '{')
                    ans+=2;//we neet to convert 2 signs i.e }{ to {} other one reversal can do the trick
                else
                    ans+=1;
            }
            return ans;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(minReversalToBalance(s));
        }

    }
}
