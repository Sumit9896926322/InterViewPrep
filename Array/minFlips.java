package Array;

import java.io.*;
import java.util.*;

public class minFlips {

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

	public static void minFlipsN(int arr[]) {
		int ones = 0, zeroes = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				while (i < arr.length - 1 && arr[i] == arr[i + 1])
					i++;
				zeroes++;
			} else {
				while (i < arr.length - 1 && arr[i] == arr[i + 1])
					i++;
				ones++;
			}

		}
		int minFlips = zeroes > ones ? 1 : 0;
		// Printing minimum flips in interval
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == minFlips) {
				System.out.print(i + " ");
				while (i < arr.length - 1 && arr[i] == arr[i + 1])
					i++;
				System.out.println(i);
			}
		}
	}

	public static void minFlips(int arr[]) {
		// Efficient
		int flipelem = arr[0] == 0 ? 1 : 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == flipelem) {
				System.out.print("From " + i);
				while (i < arr.length && arr[i] == flipelem)
					i++;
				System.out.println(" to " + i);
			}
		}
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			minFlipsN(arr);
		}
	}

}
