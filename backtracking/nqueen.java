package backtracking;

import java.io.*;
import java.util.*;


public class nqueen {

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

	public static void printMat(int board[][], int n) {

		String s = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1)
					s += (j + 1) + " ";
			}

		}
		if (s.length() > 0)
			ans.add(s);
	}

	public static boolean place(int board[][], int m, int n) {
		int size = board.length;
		boolean safe = true;
		s: for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == m && j == n)
					continue;

				if (i == m && j != n && board[i][j] == 1)
					safe = false;
				if (i != m && j == n && board[i][j] == 1)
					safe = false;
				if (i + j == m + n && board[i][j] == 1)
					safe = false;
				if (i - j == m - n && board[i][j] == 1)
					safe = false;

				if (!safe)
					break s;
			}

		}

		return safe;
	}

	public static void nqueen(int board[][], int i, int j, int n) {
		boolean ans = false;
		if (i >= n) {
			printMat(board, n);
			return;
		}
		if (j >= n || i >= n)
			return;

		if (place(board, i, j)) {
			board[i][j] = 1;
			nqueen(board, i + 1, 0, n);
			board[i][j] = 0;


		}

		nqueen(board, i, j + 1, n);

	}

	static int board[][];
	static ArrayList<String> ans;

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			board = new int[n][n];
			ans = new ArrayList<String>();
			nqueen(board, 0, 0, n);

			if (ans.size() == 0)
				System.out.print(-1);
			for (String s : ans)
				System.out.print("[" + s + "] -");

			System.out.println();



		}
	}

}
