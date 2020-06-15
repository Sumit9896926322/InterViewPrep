package DP;

import java.io.*;
import java.util.*;

public class CoinChange {

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

	public static int coinChangeDp(int coins[], int price) {
		int dp[][] = new int[coins.length + 1][price + 1];

		for (int i = 0; i <= price; i++)
			dp[0][i] = 0;

		for (int i = 1; i <= coins.length; i++)
			dp[i][0] = 1;

		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= price; j++) {
				if (coins[i - 1] > j)
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];

			}

		}

		return dp[coins.length][price];
	}
	public static int coinChange(int coins[], int price, int curr) {

		if (price == 0)
			return 1;
		if (price < 0 || curr < 0)
			return 0;

		return coinChange(coins, price - coins[curr], curr) + coinChange(coins, price, curr - 1);


	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int price = nextInt();

			int ans = coinChangeDp(arr, price);
			System.out.println(ans);
		}
	}

}
