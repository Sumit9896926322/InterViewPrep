package GFG.DP;

import java.io.*;
import java.util.*;

public class OptimalGame {

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

	public static int uniquepaths(int mat[][], int i, int j) {


		if (i >= mat[0].length || j >= mat[0].length)
			return 0;

		if (i < 0 || j < 0)
			return 0;

		if (mat[i][j] != 0) {
			return mat[i][j] + 1;
		}

		if (j == mat[0].length - 1 && i == mat.length - 1)
			return 1;

		mat[i][j] = uniquepaths(mat, i, j + 1) + uniquepaths(mat, i + 1, j);
		return mat[0][0];
	}
	public static int optimalGame(int arr[], int first, int last) {

		if (first >= last)
			return 0;

		if (Math.min(first, last) == first)
			first += 1;
		else
			last -= 1;

		return Math.max(arr[first] + optimalGame(arr, first + 1, last), arr[last] + optimalGame(arr, first, last - 1));
	}

	public static void main(String[] args) throws IOException {

		int T = 1;

		T = nextInt();
		while (T-- > 0) {

			int arr[] = nextArr();
			int m = arr[0];
			int n = arr[1];
			int mat[][] = new int[m][n];
			System.out.println(uniquepaths(mat, 0, 0));

		}
	}

}
