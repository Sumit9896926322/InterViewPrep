package GFG.GFG.Stack;

import java.util.*;
import java.io.*;

public class SortStack {

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

	public static void sortStack(Stack<Integer> s, int arr[]) {
		Stack<Integer> temp = new Stack<Integer>();

		for (int i : arr) {
			if (s.empty()) {
				s.push(i);
			} else {
				while (!s.empty() && s.peek() < i) {
						temp.push(s.pop());
				}
				s.push(i);
				while (!temp.empty()) {
					s.push(temp.pop());
				}
			}
		}

		for (int i : s)
			System.out.print(i + " ");


	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();


		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			Stack<Integer> s = new Stack();

			sortStack(s, arr);


		}
	}

}
