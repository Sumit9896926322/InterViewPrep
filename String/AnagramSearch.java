package String;

import java.io.*;
import java.util.*;

public class AnagramSearch {

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

	public static boolean same(int s[], int p[]) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] != p[i])
				return false;
		}
		return true;
	}

	public static int AnagramSearch(String s, String pat) {

		int str[] = new int[27];
		int p[] = new int[27];

		int count = 0;
		for (int i = 0; i < pat.length(); i++) {
			p[pat.charAt(i) - 'a']++;
			str[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i <= s.length() - pat.length(); i++) {
			if (same(p, str))
				count++;

			str[s.charAt(i) - 'a']--;

			if (i + pat.length() < s.length())
				str[s.charAt(i + pat.length()) - 'a']++;

		}

		return count;
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			String pat = next();
			System.out.println(AnagramSearch(s, pat));

		}
	}

}
