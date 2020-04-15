package GFG.Hashing;

import java.io.*;
import java.util.*;

public class ZeroSumSubarr {

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

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		while (T-- > 0) {

			int n = s.nextInt();
			long arr[] = new long[n];

			for (int i = 0; i < n; i++)
				arr[i] = s.nextLong();

			long ans = 0;
			long sum = 0;
			HashMap<Long, Integer> hash = new HashMap<Long, Integer>();

			for (int i = 0; i < n; i++) {
				sum += arr[i];

				if (sum == 0)
					ans++;

				if (hash.keySet().contains(sum)) {
					ans += hash.get(sum);
					hash.put(sum, hash.get(sum) + 1);
				}
				else
					hash.put(sum, 1);

			}
			System.out.println(ans);
		}

	}
	

}
