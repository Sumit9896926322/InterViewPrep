package GFG.Hashing;

import java.util.*;
import java.io.*;

public class LongSubArrSumK {

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

			int q[] = nextArr();
			int n = q[0];
			int k = q[1];
			int arr[] = nextArr();

			HashSet<Integer> hash = new HashSet<Integer>();
			int sum = 0;
			int first = 0, second = 0;
			int min = Integer.MIN_VALUE;
			int ans = 0;

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (!hash.contains(sum)) {
					if (sum == k)
						first = i;
					hash.add(arr[i]);
				} else
					second = i;

				System.out.println(hash);
				ans = Math.max(ans, (second - first) + 1);

			}

			System.out.println(ans);

		}
	}

}
