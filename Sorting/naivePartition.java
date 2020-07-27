package Sorting;

import java.io.*;
import java.util.*;

public class naivePartition {

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

	public static int[] naivePartition(int arr[]) {
		int low = 0, high = arr.length - 1;
		int temp[] = new int[high - low + 1];
		int pivot = arr[high];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= pivot)
				temp[index++] = arr[i];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > pivot)
				temp[index++] = arr[i];
		}
		return temp;
	}

	public static int[] lomutoPartition(int arr[]) {
		int j = -1;
		int pivot = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[++j];
				arr[j] = temp;
			}
		}
		return arr;
	}

	public static int[] hoarePartition(int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		int i = low - 1;
		int j = high + 1;
		int pivot = arr[low];

		while (true) {

			i++;
			while (arr[i] < pivot)
				i++;

			j--;
			while (arr[j] > pivot)
				j--;
			if (i >= j)
				break;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			int res[] = hoarePartition(arr);
			for (int i : res)
				System.out.print(i + " ");

			System.out.println();

		}
	}

}
