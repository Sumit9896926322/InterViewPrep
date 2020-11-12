package Tree;

import java.io.*;
import java.util.*;
import Tree.*;

public class TreeHeight {

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

	public static int TreeDiameter(Node root) {
		if (root == null)
			return 0;

		int lh = TreeHeight(root.left);
		int rh = TreeHeight(root.right);

		return Math.max(lh + rh + 1, Math.max(TreeDiameter(root.left), TreeDiameter(root.right)));
	}
	public static int TreeHeight(Node root) {
		if (root == null)
			return 0;

		return 1 + Math.max(TreeHeight(root.left), TreeHeight(root.right));
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			Tree t = new Tree();
			Node root = null;
			int n = nextInt();
			int arr[] = nextArr();

			root = t.makeTree(arr);
			int height = TreeDiameter(root);
			System.out.println(height);

		}
	}

}
