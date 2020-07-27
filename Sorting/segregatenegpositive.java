package Sorting;

import java.io.*;
import java.util.*;


public class segregatenegpositive {

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

	public static int[] lomutoPartition(int arr[]) {
		int j = -1;
		// pivot  = 0, for segregating -ves and positives
		int pivot = 0;

		for (int i = 0; i < arr.length; i++) {
			// arr[i] % 2 == 0 for segregating odd and even
			// arr[i] == 0 for segregating all zeroes and ones i.e binary array
			if (arr[i] == pivot) {
				int temp = arr[i];
				arr[i] = arr[++j];
				arr[j] = temp;
			}
		}
		return arr;
	}

	public static int[] segregatePosNeg(int arr[]) {
		return lomutoPartition(arr);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();

		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			int res[] = segregatePosNeg(arr);
			for (int i : res) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
	}

}
