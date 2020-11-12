package Tree;

import java.io.*;
import java.util.*;

public class sumTree {

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

	public static int sumTree(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			int temp = root.data;
			root.data = 0;
			return temp;
		}
		int lsum = sumTree(root.left);
		int rsum = sumTree(root.right);


		root.data = lsum + rsum;


		return lsum + rsum;
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			Tree t = new Tree();
			int n = nextInt();
			int arr[] = nextArr();
			Node root = t.makeTree(arr);
			sumTree(root);
			t.levelOrder(root);

		}
	}

}
