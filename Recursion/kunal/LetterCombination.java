package Recursion.kunal;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterCombination {
    static HashMap<Character, String> hm;



    public static ArrayList<String> letterCombination(String input, String res, int i, ArrayList<String> ans) {
        if (i == input.length()) {
            ans.add(res);
            return ans;
        }
        for (int j = 0; j < hm.get(input.charAt(i)).length(); j++) {
            String currentKeyString = hm.get(input.charAt(i));
            letterCombination(input, res + currentKeyString.charAt(j), i + 1, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int T = 1;

        while (T-- > 0) {
            ArrayList<String> ans  = letterCombination("23", "", 0, new ArrayList<String>());
            System.out.println(ans);
        }
    }

}
