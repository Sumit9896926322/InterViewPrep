package string;

import java.util.Stack;

public class parenthesisChecker {
    public static boolean isParenthesisBalanced (String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i =0;i<s.length();i++){
            if( s.charAt(i) == '('||  s.charAt(i)== '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(' ){
                    st.pop();
                }else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
                    st.pop();
                } else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = new String("{}");
        System.out.println(isParenthesisBalanced(s));

    }
}
