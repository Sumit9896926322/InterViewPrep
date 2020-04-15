package BitMagic;

import java.io.*;
import java.util.*;

public class MissingNumber {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
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
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			Arrays.sort(arr);
			int codd = 0;
			Boolean found = false;
			int ceven = 0;
			int a = 0;
			int b = 0;
			for (int i = 1; i <= n; i++)
				a ^= i;
			for (int i = 0; i < arr.length; i++)
				b ^= arr[i];

			System.out.println(a ^ b);


		}
	}

}
