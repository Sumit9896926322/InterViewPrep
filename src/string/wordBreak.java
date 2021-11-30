package string;

import java.util.*;

public class wordBreak {
    static Boolean ans = false;
    public static int isWordPresent(String A, ArrayList<String> B)
    {
        for(String s:B){
            if(A.contains(s))
                return A.indexOf(s);
        }
        return -1;
    }
    public static void wordBreak(String A, ArrayList<String>B)
    {
        if(A.equals(" ")){
            ans = true;
            return;
        }
        int startingIndex = isWordPresent(A,B);
        if(startingIndex != -1){
           wordBreak(A.substring(0,startingIndex)+A.substring(startingIndex,A.length()),B);
           wordBreak(A,B);
        }
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango"};
        ArrayList<String> arr1 = new ArrayList<String>();

        for(String s:arr)
            arr1.add(s);

        String res = "ilike";
        wordBreak(res,arr1);
        System.out.println(ans);

    }
}
