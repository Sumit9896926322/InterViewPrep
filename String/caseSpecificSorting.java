package String;

import java.io.*;
import java.util.*;

public class caseSpecificSorting {

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

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			String s = next();
			int aux[] = new int[123];

			for (int i = 0; i < s.length(); i++)
				aux[s.charAt(i)]++;

			String lower = "", upper = "";

			for (int i = 0; i < aux.length; i++) {
				if (aux[i] >= 1) {
					for (int j = 1; j <= aux[i]; j++) {
						if (i >= 96 && i <= 122)
							lower += (char) i;
						else
							upper += (char) i;
					}

				}
			}
			int a = 0, b = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 96 && s.charAt(i) <= 122)
					System.out.print(lower.charAt(a++));
				else
					System.out.print(upper.charAt(b++));
			}

		}
	}

}
