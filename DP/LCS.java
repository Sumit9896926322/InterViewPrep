package DP;

import java.io.*;
import java.util.*;


public class LCS {

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

	public static void printLcs(int tab[][], String a, String b) {
		String ans = "";
		int counter = 0;
		int counteri = 0;
		// For longest common subsequence length
		// return tab[a.length()][b.length()];
		for (int i = counteri; i < a.length(); i++) {
			
			for (int j = counter; j < b.length(); j++) {

				if (tab[i][j] < tab[i + 1][j + 1]) {
					System.out.println(i + " " + j);
					ans += a.charAt(i);
					counter = j + 1;
					counteri = i + 1;
					break;
				}

			}
		}
		System.out.println(ans);
		
	}
	static int memo[][];
	public static int lcs(String a, String b, int c, int d) {

		System.out.println(a + " " + b);
		if (c == 0 || d == 0)
			return 0;

		if (memo[c - 1][d - 1] != -1) {
			System.out.println("dp  " + a + " " + b);
			return memo[c - 1][d - 1];

		}


		if (a.charAt(0) == b.charAt(0)) {
			memo[c - 1][d - 1] = 1
					+ lcs(a.substring(1, a.length()), b.substring(1, b.length()), a.length() - 1, b.length() - 1);
			// Last Character matches in both the string
		} else {

			// Possibly one of the character can be found in string
			memo[c - 1][d - 1] = Math.max(lcs(a.substring(1, a.length()), b, a.length() - 1, b.length()),
					lcs(a, b.substring(1, b.length()), a.length(), b.length() - 1));
		}

		return memo[c - 1][d - 1];
	};

	// tabulation dp bottom up
	public static int tablcs(String a, String b) {
		int tab[][] = new int[a.length() + 1][b.length() + 1];

		for (int i = 1; i < a.length() + 1; i++) {
			for (int j = 1; j < b.length() + 1; j++) {

				if (a.charAt(i - 1) == b.charAt(j - 1))
					tab[i][j] = 1 + tab[i - 1][j - 1];
				else
					tab[i][j] = Math.max(tab[i - 1][j], tab[i][j - 1]);

			}

		}

		int lcs = tab[a.length()][b.length()];
		return ((a.length() - lcs) + (b.length() - lcs));
	}


	public static void main(String[] args) throws IOException {

		int t = nextInt();
		while (t-- > 0) {
			int ar[] = nextArr();
			String arr[] = next().split(" ");

			String a = arr[0];
			String b = arr[1];

		memo = new int[a.length()][a.length()];

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++)
				memo[i][j] = -1;
		}
		int ans = tablcs(a, b);
			System.out.println(ans);
		}
	}

}
