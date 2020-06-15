package DP;

import java.io.*;
import java.util.*;

public class Kanpsack01 {

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

	public static int knapsack(int val[], int w[], int W, int curr, int i) {

		if (i >= val.length || W - w[i] < 0)
			return curr;

		return Math.max(knapsack(val, w, W - w[i], curr + val[i], i + 1), knapsack(val, w, W, curr, i + 1));
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int val[] = nextArr();
			int w[] = nextArr();
			int W = nextInt();

			int ans = knapsack(val, w, W, 0, 0);

			System.out.println(ans);

		}
	}

}
