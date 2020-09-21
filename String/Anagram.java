import java.io.*;
import java.util.*;

public class Anagram {

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

			String input[] = next().split(" ");

			String a = input[0];
			String b = input[1];

			int arr[] = new int[27];
			Boolean isAnagram = true;

			if (a.length() == b.length()) {

				for (int i = 0; i < a.length(); i++) {
					arr[a.charAt(i) - 'a']++;
					arr[b.charAt(i) - 'a']--;
				}
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 0) {
						isAnagram = false;
						break;
					}
				}
				System.out.println(isAnagram ? "YES" : "NO");
			} else {
				System.out.println("NO");
			}

		}
	}

}