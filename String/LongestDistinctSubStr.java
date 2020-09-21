package String;

import java.io.*;
import java.util.*;

public class LongestDistinctSubStr {

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

	public static int longDistinctSubstr(String s) {
		int ans = Integer.MIN_VALUE;
		int low = 0, high = 0;
		int aux[] = new int[27];

		while (low <= high && high < s.length()) {

			int val = (s.charAt(high) - 'a') + 1;
			if (aux[val] == 0) {
				aux[val]++;
				high++;
				ans = Math.max(ans, high - low);
			} else {

				aux[s.charAt(low) - 'a' + 1]--;
				low++;
			}

		}

		return ans;
	}

	public static int longDistinctGFG(String s) {

		int max = 1;
		int aux[] = new int[27];
		aux[(s.charAt(0) - 'a') + 1] = 0;
		for (int i = 1; i < s.length(); i++) {
			int val = (s.charAt(i) - 'a') + 1;
			if (aux[val] == 0) {
				max++;
				aux[val] = i;
			} else
				max = Math.max(max, i - (aux[val] + 1));

		}

		return max;
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			System.out.println(longDistinctGFG(s));

		}
	}

}
