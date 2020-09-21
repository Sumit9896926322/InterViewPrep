package String;

import java.io.*;
import java.util.*;

public class PallindromeSubstr {

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

	static int ans = 0;

	public static void checkRecur(String s, int low, int high, char ch) {
		if (low < 0 || high >= s.length())
			return;

		if (s.charAt(low) == ch && s.charAt(high) == ch) {
			ans++;
			checkRecur(s, low - 2, high + 2, ch);
		} else
			return;
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			ans = s.length();

			for (int i = 1; i < s.length() - 1; i++) {
				if (s.charAt(i - 1) == s.charAt(i + 1)) {
					ans++;
					checkRecur(s, i - 2, i + 2, s.charAt(i - 1));
				}
				System.out.println((i + 1) + " " + ans);
			}
			
			System.out.println(ans);

		}
	}

}
