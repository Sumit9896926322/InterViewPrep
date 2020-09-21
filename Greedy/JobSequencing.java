package Greedy;

import java.io.*;
import java.util.*;


public class JobSequencing {

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
			int arr[] = { 6, 10, 14, 15, 21, 22 };
			ArrayList<Integer> ar = new ArrayList<Integer>();
			int temp = n;
			int m = 2;
			int i = 0;

			if (n >= 31) {
				while (n > 0) {
					if (ar.size() == 3) {
						ar.add(n);
						break;
					}
					int elem = arr[i];
					
					if (elem != n / 2 && !ar.contains(temp - elem)) {
					ar.add(elem);
					n -= elem;
					i++;
					} else {
						i++;
					}
				}

				for (int ia : ar) {
					System.out.print(ia + " ");
				}
				System.out.println();
			} else {
				System.out.println("NO");
			}

		}
	}

}
