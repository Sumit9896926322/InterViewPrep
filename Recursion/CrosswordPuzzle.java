package Recursion;

import java.io.*;
import java.util.*;

public class CrosswordPuzzle {

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

			char crossword[][] = new char[10][10];

			for (int i = 0; i < crossword.length; i++) {
				char arr[] = next().toCharArray();
				for (int j = 0; j < arr.length; j++)
					crossword[i][j] = arr[j];

			}

			String words[] = next().split(";");

			for (int i = 0; i < words.length; i++)
				System.out.println(words[i]);
		}
	}

}
