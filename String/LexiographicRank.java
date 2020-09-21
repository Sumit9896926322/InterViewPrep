package String;

import java.io.*;
import java.util.*;

public class LexiographicRank {

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

	public static int fact(int x) {
		if (x <= 1)
			return 1;

		return (x * fact(x - 1)) % 1000003;
	}

	public static String sortStr(String s) {
		char temp[] = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	public static int lexiographicRank(String s) {


		StringBuilder str = new StringBuilder(sortStr(s));
		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			int pos = str.indexOf(s.charAt(i) + "");

			ans += pos * fact(s.length() - 1 - i);

			str.deleteCharAt(pos);

		}

		return (ans + 1) % 1000003;

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		m: while (T-- > 0) {

			String s = next();
			String temp = sortStr(s);
			for (int i = 0; i < s.length() - 1; i++) {
				if (temp.charAt(i) == temp.charAt(i + 1)) {
					System.out.println(0);
					continue m;
				}
			}
			System.out.println(lexiographicRank(s));

		}
	}

}
