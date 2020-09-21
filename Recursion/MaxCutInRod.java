package Recursion;

import java.io.*;
import java.util.*;

public class MaxCutInRod {

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

	public static int cutRod(int n, int a, int b, int c) {
		if (n < 0)
			return -1;
		if (n == 0)
			return 0;

		return Math.max(1 + cutRod(n - a, a, b, c), Math.max(1 + cutRod(n - b, a, b, c), 1 + cutRod(n - c, a, b, c)));
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int ans = cutRod(n, arr[0], arr[1], arr[2]);

			System.out.println(ans);
		}
	}

}
