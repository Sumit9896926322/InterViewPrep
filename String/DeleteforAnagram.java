package String;

import java.io.*;
import java.util.*;

public class DeleteforAnagram {

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

			String a = next();
			String b = next();

			int auxa[] = new int[27];
			int auxb[] = new int[27];
			for (int i = 0; i < a.length(); i++)
				auxa[a.charAt(i) - 'a']++;

			for (int i = 0; i < b.length(); i++)
				auxb[b.charAt(i) - 'a']++;

			int ans = 0;

			for (int i = 0; i < auxa.length; i++) {
				if (auxa[i] != auxb[i])
					ans += Math.abs(auxa[i] - auxb[i]);

			}
			System.out.println(ans);

		}
	}

}
