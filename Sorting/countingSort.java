package Sorting;

import java.io.*;
import java.util.*;

public class countingSort {

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

	public static int[] sortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] desortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a, Collections.reverseOrder());

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
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

	public static int[] countingSort(int arr[], int k) {

		int count[] = new int[k];

		for (int i : arr)
			count[i]++;

		for (int i = 1; i < count.length; i++)
			count[i] += count[i - 1];

		int temp[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			temp[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		return temp;

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int k = -1;
			for (int i : arr)
				k = Math.max(k, i);
			int res[] = countingSort(arr, k + 1);

			for (int i : res)
				System.out.print(i + " ");

			System.out.println();

		}
	}

}
