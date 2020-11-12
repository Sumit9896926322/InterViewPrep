package backtracking;

import java.io.*;
import java.util.*;

public class ratInMaze {

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

	static ArrayList<String> paths;

	public static void print(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");

			System.out.println();
		}
		System.out.println("-----");
	}

	public static void move(int m[][], int path[][], int i, int j, String walk) {
		int row = m.length;
		int col = m[0].length;

		if (i < 0 || j < 0 || i >= row || j >= col || m[i][j] == 0 || path[i][j] == 1)
			return;

		if (i == row - 1 && j == col - 1) {
			paths.add(walk);
			return;
		}

		path[i][j] = 1;

		move(m, path, i, j + 1, walk + 'R');
		move(m, path, i + 1, j, walk + 'D');
		move(m, path, i, j - 1, walk + 'L');
		move(m, path, i - 1, j, walk + 'U');

		path[i][j] = 0;

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int m[][] = new int[n][n];
			int path[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				int arr[] = nextArr();
				for (int j = 0; j < n; j++)
					m[i][j] = arr[j];

			}
			paths = new ArrayList<String>();
			move(m, path, 0, 0, "");
			if (paths.size() == 0)
				System.out.println(-1);
			else {
				for (String s : paths)
				System.out.println(s);
			}

		}
	}

}
