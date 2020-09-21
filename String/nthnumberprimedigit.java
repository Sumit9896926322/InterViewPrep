package String;

import java.io.*;
import java.util.*;

public class nthnumberprimedigit {

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

	public static int minIndexChar(String str, String patt) {
		int aux[] = new int[27];
		Arrays.fill(aux, Integer.MAX_VALUE);
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			aux[index] = Math.min(aux[index], i);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < patt.length(); i++)
			ans = Math.min(ans, aux[patt.charAt(i) - 'a']);

		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	static int prime[] = { 0, 2, 3, 5, 7 };
	static String ans = "";

	// Working but dont know how??
	public static String recurprimedigit(int num) {
		if(num <= 4)
			return ans+=prime[num];


		if (num % 4 == 0) {
			ans += 7;
			num--;
		}
		else
			ans += prime[(num % 4)];

		if (num / 4 <= 4) {
			if (num % 4 == 0)
				ans += prime[(num / 4) - 1];
			else
				ans += prime[(num / 4)];
			return ans;
		}
		return recurprimedigit(num / 4);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			String pat = next();
			int ans = minIndexChar(s, pat);
			System.out.println(ans == -1 ? "$" : s.charAt(ans));

		}
	}

}
