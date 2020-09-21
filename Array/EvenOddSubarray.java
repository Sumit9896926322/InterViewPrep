package Array;

import java.io.*;
import java.util.*;

public class EvenOddSubarray {

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

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int next = arr[0] % 2;
			int gans = 1;
			int ans = 1;

			for (int j = 1; j < arr.length; j++) {
				if (arr[j] % 2 != next) {
					next = arr[j] % 2;
					ans++;
				} else {
					ans = 1;
				}
				gans = Math.max(ans, gans);

			}
			System.out.println(gans);
		}
	}

}
