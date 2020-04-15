package GFG.GFG.Stack;

import java.io.*;
import java.util.*;

public class ArrayStack {

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
			int stack[] = new int[100000];
			int arr[] = nextArr();
			int top = -1;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 1) {
					top += 1;
					stack[top] = arr[++i];
				} else
				if (top == -1)
					System.out.print(-1 + " ");
				else {
					System.out.print(stack[top] + " ");
					top -= 1;
				}
			}
			System.out.println();
		}
	}

}
