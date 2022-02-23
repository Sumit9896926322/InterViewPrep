package backtracking;
import java.io.*;
import java.util.*;

public class cryptArithmetic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String s3 = scn.nextLine();

        HashMap<Character, Integer> charIntMap = new HashMap<>();
        String unique = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!charIntMap.containsKey(s1.charAt(i))) {
                charIntMap.put(s1.charAt(i), -1);
                unique += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!charIntMap.containsKey(s2.charAt(i))) {
                charIntMap.put(s2.charAt(i), -1);
                unique += s2.charAt(i);
            }
        }

        for (int i = 0; i < s3.length(); i++) {
            if (!charIntMap.containsKey(s3.charAt(i))) {
                charIntMap.put(s3.charAt(i), -1);
                unique += s3.charAt(i);
            }
        }

        boolean[] usedNumbers = new boolean[10];
        solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }


    public static void printAns(HashMap<Character,Integer> hash) {
        Map<Character,Integer> map = new TreeMap<Character,Integer>(hash);
        for(Map.Entry<Character,Integer> mp:map.entrySet()){
            System.out.print(mp.getKey()+"-"+mp.getValue()+" ");
        }
        System.out.println();
    }

    public static int getSum(HashMap<Character,Integer> hash,String s) {
        String sum = "";
        for(char a:s.toCharArray())
            sum+=hash.get(a);

        return Integer.parseInt(sum);
    }

    public static void solution(String unique, int idx,
                                HashMap<Character, Integer> charIntMap, boolean[] usedNumbers,
                                String s1, String s2, String s3) {
        if(idx == unique.length()){
            boolean ansMatch =  (getSum(charIntMap,s1) + getSum(charIntMap,s2)) == getSum(charIntMap,s3);
            if(ansMatch) {
                printAns(charIntMap);
            }
            return;
        }

        for(int i = 0;i<=9;i++){
            if(!usedNumbers[i]){
                usedNumbers[i] = true;
                charIntMap.put(unique.charAt(idx),i);
                solution(unique,idx+1,charIntMap,usedNumbers,s1,s2,s3);
                usedNumbers[i] = false;
                charIntMap.put(unique.charAt(idx),-1);
            }
        }
    }

}
