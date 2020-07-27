package Sorting;

import java.io.*;
import java.util.*;

public class Segregate3types {

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
	}

	// O(N^2) lomuto with insertion approach
	public static int[] segregate012(int arr[]) {
		int zero = 0;
		int one = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				// Shifting all the elements and putting zero at first.
				int temp = i;
				while (temp > zero) {
					arr[temp] = arr[temp - 1];
					temp--;
				}

				arr[zero++] = 0;
				one++;

			}
			if (arr[i] == 1) {
				swap(arr, i, ++one);
			}
		}
		return arr;
	}

	// DNF Dutch National Flag Algorithm
	public static void DNF(int arr[], int pivot) {
		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {
			// less than pivot on LHS,greater than pivot on rhs
			// Sort 0,1,2 change if conditiions
			// when pivot is in range[a,b]

			if (arr[mid] < pivot)
				swap(arr, low++, mid++);
			else if (arr[mid] == pivot)
				mid++;
			else
				swap(arr, mid, high--);



		}

	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int pivot = nextInt();
			DNF(arr, pivot);

			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();

		}
	}

}
