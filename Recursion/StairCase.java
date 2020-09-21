package Recursion;

import java.io.*;
import java.util.*;

public class StairCase {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
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
			System.out.println(arr[i]);
	}


	public static int stairCase(int n, int dp[]) {
		if (n < 0)
			return 0;

		if (n == 0)
			return 1;

		if (dp[n - 1] != 0)
			return dp[n - 1];


		dp[n - 1] = stairCase(n - 1, dp) + stairCase(n - 2, dp) + stairCase(n - 3, dp);
		return dp[n - 1];

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			int n = nextInt();
			int dp[] = new int[n];

			System.out.println(stairCase(n, dp) % 1000000007);
		}
	}

}
