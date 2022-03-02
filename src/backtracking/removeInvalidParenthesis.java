package backtracking;
import java.util.*;
public class removeInvalidParenthesis {
    public static void solution(String str, int minRemoval, HashSet<String> ans) {
        //write your code here
        if(minRemoval == 0){
            if(getMin(str) == 0) {
                if(!ans.contains(str)){
                    System.out.println(str);
                    ans.add(str);
                }
            }
            return;
        }
        for(int i = 0;i<str.length();i++){
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String res = left+right;
            solution(res,minRemoval-1,ans);
        }
    }

    public static int getMin(String str){
        //write your code here
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                st.push('(');
            }else{
                if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
                else
                    st.push(')');
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str, getMin(str),new HashSet<>());
    }
}

