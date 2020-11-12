package backtracking;

import java.io.*;
import java.util.*;

public class sudoku {

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

	public static void printMat(int mat[][], int n) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}

		}

	}

	public static boolean canPlace(int board[][], int i, int j, int elem) {

		for (int k = 0; k < board.length; k++) {
			if (board[i][k] == elem || board[k][j] == elem)
				return false;
		}

		int sub = (int) Math.sqrt(board.length);
		i = i - (i % sub);
		j = j - (j % sub);

		for (int k = i; k < i + sub; k++) {
			for (int l = j; l < j + sub; l++) {
				if (board[k][l] == elem)
					return false;
			}
	}

		return true;
	}

	public static boolean solve(int board[][], int n) {
		int i = 0, j = 0;
		boolean solveans = false;
		s: for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (board[i][j] == 0)
					break s;
			}
		}


		if (i == n && j == n) {
			printMat(board, n);
			return true;
		}

		for (int k = 1; k <= n; k++) {
			if (canPlace(board, i, j, k)) {
				board[i][j] = k;
				solveans = solve(board, n);
				board[i][j] = 0;
			}
			if (solveans)
				return true;
	}
		return false;

}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = 9;
			int board[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				int arr[] = nextArr();
				for (int j = 0; j < n; j++)
					board[i][j] = arr[j];
			}

			solve(board, n);

		}
	}

}
