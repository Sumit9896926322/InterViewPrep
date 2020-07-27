package Sorting;

import java.io.*;
import java.util.*;

public class Union2Sorted {

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

	public static void intersectionSorted(int arr1[], int arr2[]) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {

			if (i != arr1.length - 1 && arr1[i] == arr1[i + 1]) {
				i++;
				continue;
			}
			if (j != arr2.length - 1 && arr2[j] == arr2[j + 1]) {
				j++;
				continue;
			}
			if (arr1[i] < arr2[j])
				++i;
			else if (arr1[i] > arr2[j])
				++j;
			else {
				result.add(arr1[i]);
				i++;
				j++;
			}

		}
	}
	public static void unionSorted(int arr1[], int arr2[]) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (i != arr1.length - 1 && arr1[i] == arr1[i + 1]) {
				i++;
				continue;
			}
			if (j != arr2.length - 1 && arr2[j] == arr2[j + 1]) {
				j++;
				continue;
			}
			if (arr1[i] < arr2[j])
				result.add(arr1[i++]);
			else if (arr1[i] > arr2[j])
				result.add(arr2[j++]);
			else {
				result.add(arr1[i]);

				i++;
				j++;
			}

		}

		while (i < arr1.length) {
			if (i != arr1.length - 1 && arr1[i] == arr1[i + 1])
				continue;
			result.add(arr1[i++]);

		}
		while (j < arr2.length) {
			if (j != arr2.length - 1 && arr2[j] == arr2[j + 1])
				continue;
			result.add(arr2[j++]);

		}

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr1[] = nextArr();
			int arr2[] = nextArr();

			intersectionSorted(arr1, arr2);

		}
	}

}
