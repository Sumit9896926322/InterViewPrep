import java.io.*;
import java.util.*;

public class Kanpsack01 {

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

	public static int knapsackDp(int val[], int w[], int W) {
		int n = val.length;
		int dp[][] = new int[n + 1][W + 1];

		// Filling first column to 0
		for (int i = 0; i < dp.length; i++)
			dp[i][0] = 0;

		// Filling first row to 0
		for (int i = 1; i < dp[0].length; i++)
			dp[0][i] = 0;

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {

				// if we can't add more item then
				if (j < w[i - 1])
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - w[i - 1]]);

			}
		}

		return dp[n][W];
	}

	public static int knapsack(int val[], int w[], int W, int curr, int i) {

		if (i >= val.length || W - w[i] < 0)
			return curr;

		return Math.max(knapsack(val, w, W - w[i], curr + val[i], i + 1), knapsack(val, w, W, curr, i + 1));
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int W = nextInt();
			int val[] = nextArr();
			int w[] = nextArr();


			int ans = knapsackDp(val, w, W);

			System.out.println(ans);

		}
	}

}
