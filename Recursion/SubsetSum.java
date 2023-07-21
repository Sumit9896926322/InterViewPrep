package Recursion;

import java.util.*;
import java.io.*;

public class SubsetSum {

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

	static int ans = 0;

	public static void subsetSum(int arr[], int subsum, int i, int k) {
		if (i >= arr.length) {
			System.out.println(subsum);
			if (subsum == k)
				ans++;
			return;
		}
		subsetSum(arr, subsum, i + 1, k);
		subsetSum(arr, subsum += arr[i], i + 1, k);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int arr[] = nextArr();
			int k = nextInt();
			ans = 0;
			subsetSum(arr, 0, 0, k);
			System.out.println(ans);

		}
	}

}
