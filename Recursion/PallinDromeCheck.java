package Recursion;

import java.io.*;
import java.util.*;

public class PallinDromeCheck {

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

	public static boolean pallinCheck(String s, int l, int r) {
		if (l >= r)
			return true;
		if (s.charAt(l) != s.charAt(r))
			return false;
		return pallinCheck(s, l + 1, r - 1);

	}


	public static int sumDigit(int num) {
		if (num == 0)
			return 0;
		return num % 10 + sumDigit(num / 10);
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {


			int n = nextInt();
			System.out.println(sumDigit(n));

		}
	}

}
