package String;

import java.io.*;
import java.util.*;

public class NaivePatternSearching {

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

	public static void naiveDistinctSearch(String s, String p) {
		int n = s.length();
		int m = p.length();
		for (int i = 0; i <= n - m; i++) {

			for (int j = 0; j < m; j++) {
				if (s.charAt(i + j) != p.charAt(j))
					break;

				if (j == m - 1) {
					System.out.println((i));
					i = (i + j);
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			String pat = next();
			naiveDistinctSearch(s, pat);
		}
	}

}
