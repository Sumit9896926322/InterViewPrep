package Array;

import java.io.*;
import java.util.*;

public class FrequencyInSorted {

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

	public static int count1s(int arr[]) {
		int ans = 0;
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				curr++;
			} else {
				ans = Math.max(curr, ans);
				curr = 0;
			}
		}

		return Math.max(curr, ans);

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			System.out.println(count1s(arr));
			for (int i = 0; i < arr.length; i++) {
				int count = 1;
				while (i < n - 1 && arr[i] == arr[i + 1]) {
					count++;
					i++;
				}
				System.out.println(arr[i] + " " + count);
			}

		}
	}

}
