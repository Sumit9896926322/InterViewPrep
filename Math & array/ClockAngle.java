package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClockAngle {

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

	public static boolean isLeap(int i) {
		if ((((i % 4 == 0) && i % 100 != 0)) || (i % 400 == 0))
			return true;
		return false;

	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int T = nextInt();
		while (T-- > 0) {
			String ars[] = br.readLine().split(" ");
			float h = Float.parseFloat(ars[0]);
			float m = Float.parseFloat(ars[1]);
			double ans = (5d / 60d) * m;

			double res = (m - ((h * 5) + (ans % 5))) * 6;
			res = Math.abs(res);
			System.out.println((int) Math.abs(Math.min(res, 360 - res)));

		}
	}

}
