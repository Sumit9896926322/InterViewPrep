package Recursion;

import java.io.*;
import java.util.*;

public class floodFill {

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

	public static void floodfill(int mat[][], int i, int j, int k, int m, int n, int target) {

		if (i < 0 || j < 0 || i >= m || j >= n)
			return;

		if (mat[i][j] != target)
			return;

		mat[i][j] = k;

		floodfill(mat, i, j + 1, k, m, n, target);
		floodfill(mat, i + 1, j, k, m, n, target);
		floodfill(mat, i, j - 1, k, m, n, target);
		floodfill(mat, i - 1, j, k, m, n, target);

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			int input[] = nextArr();
			int row = input[0];
			int col = input[1];

			int arr[] = nextArr();
			int z = 0;
			int mat[][] = new int[row][col];

			int input1[] = nextArr();
			int s = input1[0];
			int e = input1[1];
			int k = input1[2];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = arr[z++];
				}

			}

			floodfill(mat, s, e, k, row, col, mat[s][e]);

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					System.out.print(mat[i][j] + " ");
				}

			}
			System.out.println();

		}
	}

}
