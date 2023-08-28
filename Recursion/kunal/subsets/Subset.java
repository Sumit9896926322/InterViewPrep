package Recursion.kunal.subsets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subset {

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

	public static void permutation(String s, String curr, int i) {

		if (i >= s.length()) {
			System.out.println(curr);
			return;
		}

		permutation(s, curr, i + 1);
		permutation(s, curr + s.charAt(i), i + 1);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			permutation(s, "", 0);

		}
	}

}
