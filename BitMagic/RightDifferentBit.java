package BitMagic;

import java.io.*;
import java.util.*;

public class RightDifferentBit {

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

	public static void main(String[] args) throws IOException {
//Calculation first set bit log2(n&-n)+1;
		int T = nextInt();
		while (T-- > 0) {
			int arr[] = nextArr();
			int n = arr[0];
			int k = arr[1];
			int result = n ^ k;
			System.out.println((int) ((Math.log10(result & -result)) / Math.log10(2)) + 1);
		}
	}

}
