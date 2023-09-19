package Recursion.striver;

import java.util.ArrayList;
import java.util.HashSet;

public class SubsetSum {

    public static HashSet<ArrayList<Integer>> subsetSum(int arr[], ArrayList<Integer> res, int i) {
        if (i == arr.length) {
            HashSet<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();
            ans.add(res);
            return ans;
        }
        HashSet<ArrayList<Integer>> fans = new HashSet<ArrayList<Integer>>();
        res.add(arr[i]);

        HashSet<ArrayList<Integer>> rans = subsetSum(arr, res, i + 1);
        res.remove(res.size()-1);
        HashSet<ArrayList<Integer>> lans = subsetSum(arr, res, i + 1);
        fans.addAll(lans);
        fans.addAll(rans);
        return fans;
    }

    public static void main(String[] args) {
        int []arr = {1,1,3};

        HashSet<ArrayList<Integer>> ans = subsetSum(arr, new ArrayList<Integer>(), 0);
        for (ArrayList<Integer> a : ans) {
            System.out.println(a.toString());
        }
    }
}
