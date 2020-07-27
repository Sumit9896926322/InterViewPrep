package Sorting;

import java.io.*;
import java.util.*;

public class merge2SortedArray {

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

	public static int[] merge(int arr[], int l, int m, int h) {

		int arr1[] = Arrays.copyOfRange(arr, l, m + 1);
		int arr2[] = Arrays.copyOfRange(arr, m + 1, h + 1);

		return merge2SortedArr(arr, arr1, arr2);

	}


	public static int[] merge2SortedArr(int arr[], int arr1[], int arr2[]) {

		int res[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				res[k++] = arr1[i++];
			else
				res[k++] = arr2[j++];

		}

		while (i < arr1.length)
			res[k++] = arr1[i++];
		while (j < arr2.length)
			res[k++] = arr2[j++];

		for (int z = 0; z < res.length; z++)
			arr[z] = res[z];

		return res;

	}


	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			int arr[] = nextArr();


		}
	}

}
