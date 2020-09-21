package String;

import java.io.*;
import java.util.*;

public class LeftRepeating {

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

	public static String nonRepeating(String s) {

		int aux[] = new int[26];

		Arrays.fill(aux, -1);

		for (int i = 0; i < s.length(); i++) {

			int j = s.charAt(i) - 'a';

			if (aux[j] == -1)
				aux[j] = i;
			else
				aux[j] = -2;

		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] >= 0)
				ans = Math.min(ans, aux[i]);

		}
		return ans == Integer.MAX_VALUE ? "-1" : s.charAt(ans) + "";
	}

	public static String leftMostRepeating(String a) {

		int ans = 1;
		int arr[] = new int[256];
		Boolean found = false;
		char ansc = ' ';
		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i)]++;

			if (arr[a.charAt(i)] > ans) {
				found = true;
				return a.charAt(i) + "";
			}
		}

		return "-1";
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			int n = nextInt();
			String s = next();

			System.out.println(nonRepeating(s));

		}
	}

}

