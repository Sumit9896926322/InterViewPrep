package DP;

import java.io.*;
import java.util.*;

public class EditDistance {

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

	static int memo[][];

	public static int memoEd(String a, String b) {

		int m = a.length() + 1;
		int n = b.length() + 1;
		int tabEd[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			tabEd[i][0] = i;

		for (int j = 0; j < n; j++)
			tabEd[0][j] = j;

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1))
					tabEd[i][j] = tabEd[i - 1][j - 1];
				else {
					int max = Math.min(Math.min(tabEd[i - 1][j], tabEd[i][j - 1]), tabEd[i - 1][j - 1]);
					tabEd[i][j] = max + 1;
				}
//				System.out.print(tabEd[i][j] + " ");
			}
//			System.out.println();
		}
		return tabEd[m - 1][n - 1];
	}
	public static int editDistance(String a, String b, int m, int n) {

		if (memo[m][n] != -1)
			return memo[m][n];

		if (m == 0)
			return n;
		if (n == 0)
			return m;

		if (a.charAt(0) == b.charAt(0))
			memo[m][n] = editDistance(a.substring(1, m), b.substring(1, n), m - 1, n - 1);
		else {
			int insert = editDistance(a, b.substring(1, n), m, n - 1);
			int replace = editDistance(a.substring(1, m), b.substring(1, n), m - 1, n - 1);
			int delete = editDistance(a.substring(1, m), b, m - 1, n);

			// returning minimum of the three
			memo[m][n] = 1 + Math.min(Math.min(insert, replace), delete);
		}

		return memo[a.length()][b.length()];

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			String s = next();
			String values[] = next().split(" ");
			String a = values[0];
			String b = values[1];

			memo = new int[a.length() + 1][b.length() + 1];

			for (int i = 0; i < a.length() + 1; i++) {
				for (int j = 0; j < b.length() + 1; j++) {
					memo[i][j] = -1;
				}
			}

			int ans = memoEd(a, b);
			System.out.println(ans);
		}
	}

}
