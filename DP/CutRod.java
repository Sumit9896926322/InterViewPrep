package DP;

import java.io.*;
import java.util.*;

public class CutRod {

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

	public static int cutRod(int n, int a, int b, int c) {

		if (n <= 0)
			return 0;

		return Math.max(Math.max(1 + cutRod(n - a, a, b, c), 1 + cutRod(n - b, a, b, c)), 1 + cutRod(n - c, a, b, c));
	}

	public static String twoStrings(String s1, String s2) {
		// HackerRank 20th may 2020
		Boolean flag = false;
		char arr[] = s1.toCharArray();
		Arrays.sort(arr);
		s1 = new String(arr);
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr);
		s2 = new String(arr2);

		System.out.println(s1 + " " + s2);

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(Math.min(i, s1.length() - 1)) == s2.charAt(Math.min(i, s2.length() - 1))) {

				flag = true;
				break;
			}
		}
		return (flag ? "YES" : "NO");

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int a = arr[0];
			int b = arr[1];
			int c = arr[2];

			int ans = cutRod(n, a, b, c);
			System.out.println(ans);
		}
	}

}
