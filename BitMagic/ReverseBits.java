package GFG.BitMagic;

import java.io.*;
import java.util.*;

public class ReverseBits {

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

	int T = nextInt();
	while (T-- > 0) {

		int n = nextInt();
			int count = 0;
			long ans = 0;
		while(n>0) {
				count++;
				if ((n & 1) == 1)
					ans += Math.pow(2, 32 - count);
				
			n = n >> 1;
		}
			System.out.println(ans);

	}
}

}
