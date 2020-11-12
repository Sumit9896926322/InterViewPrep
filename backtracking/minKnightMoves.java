package backtracking;

import java.io.*;
import java.util.*;
import backtracking.nqueen;

public class minKnightMoves {

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

	static int ans;
	static nqueen n1 = new nqueen();

	public static void printMat(int board[][], int n) {

		String s = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	// TLE
	public static void knightmove(int board[][], int i, int j, int m, int n, int move) {

		if (i < 0 || j < 0 || i >= board.length || j >= board.length)
			return;

		if (board[i][j] != 0 && move > board[i][j])
			return;


		if (i == m && j == n) {
			ans = Math.min(ans, move);
			board[i][j] = ans;
			return;
		}
		board[i][j] = move;
		printMat(board, board.length);

		knightmove(board, i - 1, j - 2, m, n, move + 1);
		knightmove(board, i - 1, j + 2, m, n, move + 1);
		knightmove(board, i + 1, j - 2, m, n, move + 1);
		knightmove(board, i + 1, j + 2, m, n, move + 1);
		knightmove(board, i - 2, j - 1, m, n, move + 1);
		knightmove(board, i - 2, j + 1, m, n, move + 1);
		knightmove(board, i + 2, j - 1, m, n, move + 1);
		knightmove(board, i + 2, j + 1, m, n, move + 1);

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();

		while (T-- > 0) {

			int n = nextInt();
			int board[][] = new int[n][n];
			ans = Integer.MAX_VALUE;
			int arr[] = nextArr();
			int arr1[] = nextArr();

			int s1 = arr[0] - 1;
			int s2 = arr[1] - 1;
			int d1 = arr1[0] - 1;
			int d2 = arr1[1] - 1;
			knightmove(board, s1, s2, d1, d2, 1);
			System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);

		}
	}

}
