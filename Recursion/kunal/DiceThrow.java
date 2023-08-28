package Recursion.kunal;

import java.util.ArrayList;
import java.util.HashMap;

public class DiceThrow {
    static HashMap<Character, String> hm;

    public static ArrayList<String> diceThrow(String combination, int target, int sum) {
        if (sum == target) {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(combination);
            return ans;
        }
        ArrayList<String> combinations = new ArrayList<String>();
        for (int j = 1; j <= 6; j++) {
            if (sum + j <= target) {
                ArrayList<String> ans = diceThrow(combination + j, target, sum + j);
                combinations.addAll(ans);
            }
        }
        return combinations;
    }

    public static void main(String[] args) {
        int T = 1;

        while (T-- > 0) {
            ArrayList<String> ans = diceThrow("", 4, 0);
            System.out.println(ans);
        }
    }

}
