package GFG.Hashing;

import java.io.*;
import java.util.*;

public class DistinctinWindow {

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

			int lines[] = nextArr();
			int n = lines[0];
			int k = lines[1];

			if (k > n) {
				System.out.println(0);
				continue;
			}

			String arr[] = next().split(" ");

			TreeMap<String, Integer> hash = new TreeMap<String, Integer>();
			int windowsum = 0;
			for (int i = 0; i < n; i++) {
				if (!hash.containsKey(arr[i])) {
					windowsum += 1;
					hash.put(arr[i], 1);
				} else
					hash.put(arr[i], hash.get(arr[i]) + 1);


				if (i >= k - 1) {



					int remove = hash.get(arr[i - (k - 1)]) - 1;
					// Element gone out of hashmap
					if (remove == 0)
						windowsum -= 1;
					
					hash.put(arr[i - (k - 1)], remove);
					System.out.print(windowsum + " ");

				}

			}
                  System.out.println();
		}
	}


}
