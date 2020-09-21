package Array.SlidingWindow;

import java.io.*;
import java.util.*;

public class MaximumKsubsum {

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

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int input[] = nextArr();
			int n = input[0];
			int k = input[1];
			int arr[] = nextArr();

			int ans = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < k; i++)
				sum += arr[i];

			ans = Math.max(sum, ans);

			for (int i = k; i < arr.length; i++) {
				sum += arr[i] - arr[i - k];
				ans = Math.max(sum, ans);
			}

			System.out.println(ans);

		}
	}

}
