package Recursion;

import java.io.*;
import java.util.*;

public class DigitalRoot {

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

	public static long recurSum(String s) {
		if (s.length() == 0)
			return 0;

		return Long.parseLong(s.charAt(s.length() - 1) + "") + recurSum(s.substring(0, s.length() - 1));
	}

	public static long digitalRoot(String s, boolean c, int k) {
//HackerRank
		long digitSum = recurSum(s);
		if (c) {
			digitSum *= k;
			c = false;
		}

		if (digitSum / 10 == 0)
			return digitSum;
		else
			return digitalRoot(digitSum + "", c, k);

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String arr[] = next().split(" ");
			long sum = 0;
			for (int i = 0; i < arr[0].length(); i++)
				sum += Character.getNumericValue(arr[0].charAt(i));

			System.out.println(digitalRoot(sum + "", true, Integer.parseInt(arr[1])));

		}
	}

}
