package graph;

import java.io.*;
import java.util.*;

//This is based on solving maze
//Graph DFS

public class Countluck {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
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

	public static String next() throws IOException {
		return br.readLine();
	}



	public static int countLuck(String arr[][], int m, int n, int k, int row, int col, int count) {

		int current = 0;
		if (m == row || n == col || m < 0 || n < 0) {
			count = 0;
			return 0;
		}

		if (arr[m][n].equals("X")) {
			count = 0;
			return 0;
		}


		if (arr[m][n].equals("*"))
			return count;


		if (m + 1 < row && (arr[m + 1][n].equals(".") || arr[m + 1][n].equals("*")))
			current++;
		if (m - 1 >= 0 && (arr[m - 1][n].equals(".") || arr[m - 1][n].equals("*")))
			current++;
		if (n + 1 < col && (arr[m][n + 1].equals(".") || arr[m][n + 1].equals("*")))
			current++;
		if (n - 1 >= 0 && (arr[m][n - 1].equals(".") || arr[m][n - 1].equals("*")))
			current++;

		if (current >= 2) {
			count++;
		}

		// Marking as visited
		arr[m][n] = "X";

		int a = countLuck(arr, m, n + 1, k, row, col, count);
		int b = countLuck(arr, m + 1, n, k, row, col, count);
		int c = countLuck(arr, m, n - 1, k, row, col, count);
		int d = countLuck(arr, m - 1, n, k, row, col, count);

		return Math.max(a, Math.max(b, Math.max(c, d)));

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int input[] = nextArr();
			int m = input[0];
			int n = input[1];
			String arr[][] = new String[m][n];

			int a = 0;
			int b = 0;

			for (int i = 0; i < m; i++) {
				char col[] = next().toCharArray();
				for (int j = 0; j < col.length; j++) {
					if (col[j] == 'M') {
						a = i;
						b = j;

					}
					arr[i][j] = col[j] + "";
				}

			}
			int k = nextInt();
			int count = 0;

			int res = countLuck(arr, a, b, k, m, n, count);

			System.out.println(res == k ? "Impressed" : "Oops!");
		}
	}

}
