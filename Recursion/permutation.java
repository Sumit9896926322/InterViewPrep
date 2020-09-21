package Recursion;

import java.io.*;
import java.util.*;

public class permutation {

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

	public static String swap(String s, int i, int j) {
		char arr[] = s.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return new String(arr);
	}

	public static void permutation(String s, int i, int j) {

		if (j == s.length()) {
			System.out.println(s);
			return;
		}
		s = swap(s, i, j);
		permutation(s, i, j + 1);
		permutation(s, i + 1, j);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			permutation(s, 0, 0);

		}
	}

}
