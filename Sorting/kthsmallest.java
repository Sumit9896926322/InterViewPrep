package Sorting;

import java.io.*;
import java.util.*;
import Sorting.naivePartition;
public class kthsmallest {

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

	public static int lomutoPartition(int arr[], int low, int high) {
		int j = -1;
		int pivot = arr[high];
		int pos = 0;
		for (int i = low; i <= high; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[++j];
				arr[j] = temp;
			}
			pos = i + 1;
		}
		return pos;
	}

	public static int findKthSmallest(int arr[], int k) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int pindex = lomutoPartition(arr, low, high);
			if (pindex == k - 1) {
				return arr[k];
			} else if (pindex < k - 1)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int k = nextInt();

			System.out.println(findKthSmallest(arr, k));

		}
	}

}
