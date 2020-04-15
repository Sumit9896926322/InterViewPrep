package GFG.Hashing;

import java.io.*;
import java.util.*;

public class GroupAnagram {

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
			String arr[] = next().split(" ");

			TreeMap<String, Integer> hash = new TreeMap<String, Integer>();

			for (int i = 0; i < arr.length; i++) {
				char ch[] = arr[i].toCharArray();
				Arrays.sort(ch);
				String str = new String(ch);

				if (!hash.containsKey(str))
					hash.put(str, 1);
				else
					hash.put(str, hash.get(str) + 1);

			}

			ArrayList<Integer> ans = new ArrayList<Integer>(hash.values());
			Collections.sort(ans);

			for (int i : ans)
				System.out.print(i + " ");

		}
	}

}
