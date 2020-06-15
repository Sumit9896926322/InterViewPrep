package DP;

import java.io.*;
import java.util.*;

public class MinJumps {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	static int res = Integer.MAX_VALUE;

	public static int minJumpsDp(int arr[]) {
		int dp[] = new int[arr.length];

		dp[0] = 0;

		for (int i = 1; i < dp.length; i++)
			dp[i] = Integer.MAX_VALUE;

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (j + arr[j] >= i) {
					if (dp[j] != Integer.MAX_VALUE)
						dp[i] = Math.min(dp[j] + 1, dp[i]);
				}
			}
		}
		return dp[arr.length - 1];
	}
	public static int minJumps(int index, int arr[], int ans) {

		if (index + arr[index] >= arr.length - 1)
			return ans + 1;

		for (int i = index + 1; i <= index + arr[index]; i++) {
			int a = minJumps(i, arr, ans + 1);

			if (a != 0 && a != Integer.MAX_VALUE)
				res = Math.min(res, a);
			return res;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();

		while (T-- > 0) {
			int n = nextInt();
			int arr[] = nextArr();
			res = Integer.MAX_VALUE;

			int ans1 = minJumpsDp(arr);
			System.out.println(ans1 == Integer.MAX_VALUE ? -1 : ans1);
		}
	}

}
