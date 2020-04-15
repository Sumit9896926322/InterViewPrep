package BitMagic;

import java.io.*;
import java.util.*;

public class Flipinrange {
	static String binary = "";
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

	public static void convertBinary(int n) {

		if (n >= 1)
			convertBinary(n / 2);
		binary += n % 2;
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int arr[] = nextArr();

			int n = arr[0];
			int l = arr[1];
			int r = arr[2];

			binary = "";
			convertBinary(n);
			String s = new String(new char[n - binary.length()]).replace("\0", "0");
			s += binary;
			StringBuilder k = new StringBuilder(s);
			k = k.reverse();

			for (int i = r; i >= l; i--) {
				if (k.charAt(i - 1) == '0')
					n += Math.pow(2, i - 1);
				else
					
					n -= Math.pow(2, i - 1);

			}
			System.out.println(n);

		}
	}

}
