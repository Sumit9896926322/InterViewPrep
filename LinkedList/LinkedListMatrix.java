package LinkedList;

import java.io.*;
import java.util.*;


class LinkedListMatrix {
	static Node head;
	static int size;
	static int length = 0;

	static class Node {
		int data;
		Node right;
		Node down;

		Node(int d) {
			data = d;
			right = null;
			down = null;
			size++;
		}
	}

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

	public static Node makenew(int data, int d, int r) {

		Node elem = new Node(data);
		Node elemd = new Node(d);
		Node elemr = new Node(r);

		if (d > 0)
			elem.down = elemd;
		if (r > 0)
			elem.right = elemr;


		return elem;

	}
	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		while (T-- > 0) {

			int n = nextInt();
			int arr[][] = new int[n][n];
			Node link[][] = new Node[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = s.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (i < n - 1 && j < n - 1)
						makenew(arr[i][j], arr[i + 1][j], arr[i][j + 1]);
					else {
						if (i == n - 1 && j == n - 1)
							makenew(arr[i][j], 0, 0);
						else if (j == n - 1)
							makenew(arr[i][j], arr[i + 1][j], 0);
						else
							makenew(arr[i][j], 0, arr[i][j + 1]);
					}

				}
			}

			Node dp = link[0][0];
			Node rp;
			while (dp != null) {
				rp = dp;
				while (rp != null) {
					System.out.print(rp.data + " ");
					rp = rp.right;
				}
				dp = dp.down;
				System.out.println();
			}

		}
	}

}
