package String;

import java.io.*;
import java.util.*;

public class RabinKarp {

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

	public static int hashcalc(int d, String a) {
		// Calcultaing hash for pattern on assuming
		// a = 1,b = 2....z = 26.
		int hashval = 0;
		for (int i = 0; i < a.length(); i++)
			hashval += valcalc(a.charAt(i)) * Math.pow(5, a.length() - 1 - i);

		return hashval;
	}

	public static int valcalc(char a) {
		return (a - 'a') + 1;
	}

	public static void rabinKarp(String s, String pat) {
		int d = 5;
		int pathash = hashcalc(d, pat);
		int strhash = hashcalc(d, s.substring(0, pat.length()));

		for (int i = 0; i <= s.length() - pat.length(); i++) {

			if (strhash == pathash) {
				for (int j = 0; j < pat.length(); j++) {

					if (s.charAt(i + j) != pat.charAt(j))
						break;
					if (j == pat.length() - 1)
						System.out.println(i);

				}
			}

			// formula for generating rolling hash
			if (i + pat.length() < s.length())
			strhash = d * (strhash - (valcalc(s.charAt(i)) * (int) Math.pow(d, pat.length() - 1)))
					+ valcalc(s.charAt(i + pat.length()));

		}


	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			String pat = next();
			rabinKarp(s, pat);

		}
	}

}
