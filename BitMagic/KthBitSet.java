package BitMagic;

import java.io.*;
import java.util.*;

public class KthBitSet {

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
		// Efficient approach
		// ((1<<k)& n)!=0?"Yes":"No"
		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int k = nextInt();
			Boolean isSet = false;
			int count = 0, ans = 0;
			while (n > 0) {
				if ((n & 1) == 1) {
					if ((count - 1) == k) {
						isSet = true;
						break;
					}
				}
				count++;
				n = n >> 1;
			}
			System.out.println(isSet ? "Yes" : "No");

		}
	}

}
