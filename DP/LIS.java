package DP;

import java.io.*;
import java.util.*;

public class LIS {

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

	static ArrayList<Integer> lisArr;
	static int inc = 0;

	public static int LIS(int arr[], int pos, int curr) {

		// Base Case
		if (pos == arr.length || curr == arr.length)
			return 0;

		inc = 0;
		if (arr[curr] > pos) {
			inc = 1 + LIS(arr, arr[curr], curr + 1);
		}

		return Math.max(inc, LIS(arr, pos, curr + 1));

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int lis[] = new int[n];
			int ans = 0;
			lis[0] = 1;

			for (int i = 1; i < arr.length; i++) {
				int large = 0;
				for (int j = 0; j < i; j++) {
					if (arr[j] < arr[i])
						large = Math.max(large, lis[j]);
				}
				lis[i] = 1 + large;
				ans = Math.max(ans, lis[i]);
			}

			System.out.println(ans);

		}
	}

}
