package graph;

import java.io.*;
import java.util.*;

//Not solved
public class ConnectedCell {

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

	static int res = 0;

	public static String next() throws IOException {
		return br.readLine();
	}


	public static int connectedCell(int arr[][], int i, int j, int row, int col, int ans) {


		if (i == row || j == col || i < 0 || j < 0)
			return ans = 0;

		System.out.println(i + " " + j + " " + ans);
		if (arr[i][j] == -1) {
			ans = 0;
			return ans;
		}


		if (arr[i][j] == 1) {
			ans++;
		} else {
			ans = 0;
		}

		arr[i][j] = -1;


		res = Math.max(ans, res);

		connectedCell(arr, i, j + 1, row, col, ans);
		connectedCell(arr, i + 1, j, row, col, ans);
		connectedCell(arr, i + 1, j + 1, row, col, ans);
		connectedCell(arr, i - 1, j - 1, row, col, ans);
		connectedCell(arr, i, j - 1, row, col, ans);
		connectedCell(arr, i - 1, j, row, col, ans);
		connectedCell(arr, i - 1, j + 1, row, col, ans);
		connectedCell(arr, i + 1, j - 1, row, col, ans);

		return res;

	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int row = nextInt();
			int col = nextInt();

			int arr[][] = new int[row][col];

			for (int i = 0; i < row; i++) {
				int elem[] = nextArr();
				for (int j = 0; j < col; j++) {
					arr[i][j] = elem[j];
				}
			}
			int ans = 0;
			ans = connectedCell(arr, 0, 0, row, col, ans);
			System.out.println(ans);
		}
	}

}
