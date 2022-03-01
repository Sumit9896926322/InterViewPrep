package backtracking;
import java.io.*;
import java.util.*;

class pallindromPermutation {
    public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {

        if(cs > ts){
            String rev  = "";
            for(int i = asf.length()-1;i>=0;i--) {
                rev = rev + Character.toString(asf.charAt(i));
            }

            if(oddc != null){
                System.out.println(asf+Character.toString(oddc)+rev);
                return;
            }
            System.out.println(asf+rev);
            return;
        }


        for(char key:fmap.keySet()){
            int val = fmap.get(key);
            if(val > 0) {
                fmap.put(key, val - 1);
                generatepw(cs + 1, ts, fmap, oddc, asf + Character.toString(key));
                fmap.put(key, val);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(fmap.containsKey(ch)){
                int val = fmap.get(ch);
                fmap.put(ch,val+1);
            }else{
                fmap.put(ch,1);
            }
        }

        int oddCount  = 0;
        Character oddChar= null;
        for(char key:fmap.keySet()){
            int val = fmap.get(key);
            if(fmap.get(key)%2 != 0){
                oddChar =  key;
                oddCount++;
            }
            fmap.put(key,(val/2));
        }
        if(oddCount > 1){
            System.out.println(-1);
        }else{
            generatepw(1,str.length()/2,fmap,oddChar,"");
        }

        //write your code here
    }

}