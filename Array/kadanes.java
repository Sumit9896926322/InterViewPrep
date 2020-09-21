package Array;

import java.io.*;
import java.util.*;

public class kadanes {

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
			int ans = arr[0];
			int currsum = arr[0];
			for (int i = 1; i < arr.length; i++) {
				currsum += arr[i];

				ans = Math.max(ans, currsum);
				if (currsum < 0)
					currsum = 0;
			}

//			for (int i = 1; i < arr.length; i++) {
//				currsum = Math.max(currsum + arr[i], arr[i]);
//				ans = Math.max(ans, currsum);
//
//			}
			System.out.println(ans);
		}
	}

}
