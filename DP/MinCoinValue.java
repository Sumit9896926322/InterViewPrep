package DP;

import java.io.*;
import java.util.*;


public class MinCoinValue {

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

	public static void cuts(int arr[]) {
		TreeMap<Integer, Integer> hash = new TreeMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!hash.containsKey(arr[i]))
				hash.put(arr[i], 1);
			else
				hash.put(arr[i], hash.get(arr[i]) + 1);
		}
		int ans = arr.length;
		for (int i : hash.values()) {

				System.out.println(ans);
			ans -= i;

		}
	}
	
	public static void encryption(String s) {
		char arr[] = s.toCharArray();
		double a = Math.sqrt(s.length());
		int b = (int)a;
		int c = (int)Math.ceil(a);
		
		for (int i = 0; i < c; i++) {
			String ans = "";
			for (int j = i; j < arr.length; j += c)
				ans+=arr[j];
			
			System.out.print(ans+" ");
		}
		
	}
	public static String next() throws IOException {
		return br.readLine();
	}

	static int ans = 0;
	static int res = Integer.MAX_VALUE;

	public static int coinVal(int coins[], int price, int currCoin, int ans) {
		System.out.println(price + " " + currCoin);
		if(currCoin >= coins.length)
			return Integer.MAX_VALUE;
		if (price == 0) {
			ans++;
			return 0;
		}


		if (price >= coins[currCoin]) {
			System.out.println(price);
			coinVal(coins, price - coins[currCoin], currCoin, ans + 1);
			res = Math.min(ans, res);
		}

		coinVal(coins, price - coins[currCoin], currCoin + 1, ans);

		return res;
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int price = nextInt();
			ans = 0;

			int ans = coinVal(arr, price, 0, 0);
			System.out.println(ans);

		}
	}

}
