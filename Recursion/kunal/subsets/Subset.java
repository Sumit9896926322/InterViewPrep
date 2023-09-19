package Recursion.kunal.subsets;
import java.util.*;

public class Subset {

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		HashSet<List<Integer>> ans = subsetSum(nums, new ArrayList<Integer>(), 0);
		List<List<Integer>> fans =   new ArrayList<List<Integer>>();
		fans.addAll(ans);
		return fans;

	}

	public static HashSet<List<Integer>> subsetSum(int[]arr, List<Integer> res, int i) {
		if (i == arr.length) {
			HashSet<List<Integer>> ans = new HashSet<List<Integer>>();
			ans.add(res);
			return ans;
		}
		HashSet<List<Integer>> fans = new HashSet<List<Integer>>();
		List<Integer> inc = new ArrayList<Integer>(res);
		inc.add(arr[i]);
		List<Integer> exc = new ArrayList<Integer>(res);

		HashSet<List<Integer>> lans = subsetSum(arr, inc, i + 1);
		HashSet<List<Integer>> rans = subsetSum(arr, exc, i + 1);
		fans.addAll(lans);
		fans.addAll(rans);
		return fans;
	}

	public static void main(String[] args) {
		int []nums = {1,3,1};
		subsetsWithDup(nums);
	}

}
