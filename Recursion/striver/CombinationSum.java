package Recursion.striver;

import java.util.*;

public class CombinationSum {
    public static ArrayList<List<Integer>> diceThrow(int[] candidates, int target, int index, ArrayList<Integer> ans) {
        if (target == 0) {
            ArrayList<List<Integer>> fans = new ArrayList<List<Integer>>();
            fans.add(new ArrayList<Integer>(ans));
            return fans;
        }
        ArrayList<List<Integer>> sumBoth = new ArrayList<List<Integer>>();
        for (int j = index; j < candidates.length; j++) {
            if (target - candidates[j] >= 0) {
                ans.add(candidates[j]);
                ArrayList<List<Integer>> leftTree = diceThrow(candidates, target - candidates[j], j, ans);
                sumBoth.addAll(leftTree);
                ans.remove(ans.size() - 1);
            }
        }

        return sumBoth;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 8;
        ArrayList<List<Integer>> ans = diceThrow(arr, target, 0, new ArrayList<Integer>());

        for (List<Integer> a : ans) {
            System.out.println(a.toString());
        }

    }
}
