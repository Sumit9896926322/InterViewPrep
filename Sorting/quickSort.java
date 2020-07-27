package Sorting;

import java.io.*;
import java.util.*;

public class quickSort {

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

	public static void swap(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}

	public static int partition(int arr[], int l, int h) {
		int j = l - 1;
		int pivot = arr[h];

		for (int i = l; i < h; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, h);
			}
		}
		swap(arr, j + 1, h);
		System.out.println(pivot+" "+j+1);
		return j + 1;
	}

	public static void quickSort(int arr[], int l, int h) {

		if (l < h) {
			int pi = partition(arr, l, h);

			quickSort(arr, l, pi - 1);
			quickSort(arr, pi + 1, h);
		}
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			quickSort(arr, 0, n - 1);

			for (int i : arr) {
				System.out.println(i);
			}

		}
	}

}
