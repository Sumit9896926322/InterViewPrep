package backtracking;

import java.io.*;
import java.util.*;

public class CombinationSUm {

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

	static boolean gans = false;
	public static void combSum(ArrayList<Integer> arr, int sum, int curr, String ans) {
		if (sum < 0)
			return;

		if (sum == 0) {
			gans = true;
			ans = ans.substring(0, ans.length() - 1);
			System.out.print("(" + ans + ")");
			return;
		}

		for (int j = curr; j < arr.size(); j++) {
			combSum(arr, sum - arr.get(j), j, ans + arr.get(j) + " ");
		}
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int mat[][] = new int[n][n];
			int arr[] = nextArr();
			int k = 0;
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = arr[k++];
				}
			}

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					int colsize = mat[i].length - 1;
					if (i % 2 == 0)
						System.out.print(mat[i][j]);
					else
						System.out.print(mat[i][colsize - j]);
					System.out.print(" ");
				}

			}

		}
	}

}
