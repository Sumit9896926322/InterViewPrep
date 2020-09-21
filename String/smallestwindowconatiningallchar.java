package String;

import java.io.*;
import java.util.*;

public class smallestwindowconatiningallchar {

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


			String s = "timetopractise";
			String pat = "toc";
			ArrayList<Character> hash = new ArrayList<Character>();

			int low = 0, high = 0;
			int ans = Integer.MAX_VALUE;
			while (low < high) {
				if (pat.contains(s.charAt(high) + "")) {
					if (!hash.contains(s.charAt(high)))
						hash.add(s.charAt(high));
				}

				if (hash.size() == pat.length()) {
					ans = Math.min(ans, high - low);
					int index = hash.indexOf(s.charAt(high));
					hash.remove(index);
					low++;

				} else
					high++;

			}

		}
	}

}
