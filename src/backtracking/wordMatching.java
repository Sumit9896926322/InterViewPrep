package backtracking;
import java.util.*;
public class wordMatching {
    public static void solution(String str, String pattern, HashMap<Character,String> map, String op){
        //write your code here
        if(pattern.length() == 0){
            if(str.length() == 0){
                HashSet<Character> set = new HashSet<Character>();
                for(int i = 0;i<op.length();i++){
                    char ch = op.charAt(i);
                    if(!set.contains(ch)){
                        System.out.print(ch+" -> "+map.get(ch)+", ");
                        set.add(ch);
                    }
                }
                System.out.println(".");
                return;
            }

            return;
        }

        char ch = pattern.charAt(0);
        if(map.containsKey(ch)){
            String mappedValue = map.get(ch);
            if(str.length() >= mappedValue.length()) {
                String prefix = str.substring(0, mappedValue.length());
                String ros = str.substring(mappedValue.length());
                if (prefix.equals(mappedValue)) {
                    solution(ros, pattern.substring(1), map, op);
                }
            }

        }else{
            for(int i =0 ;i<str.length();i++){
                String prefix = str.substring(0,i+1);
                String ros = str.substring(i+1);
                map.put(ch,prefix);
                solution(ros,pattern.substring(1),map,op);
                map.remove(ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String pattern = scn.next();
        HashMap<Character,String> map = new HashMap<>();
        solution(str,pattern,map,pattern);
    }
}
