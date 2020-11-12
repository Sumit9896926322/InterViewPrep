package Tree.BST;

import java.io.*;
import java.util.*;
import Tree.*;

public class BST {

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

	public static Node insertInBST(Node root, int key) {

		if (root == null)
			return new Node(key);
		;


		if (root.data < key)
			root.right = insertInBST(root.right, key);
		else if (root.data > key)
			root.left = insertInBST(root.left, key);
		return root;

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			int key = nextInt();

			Tree t = new Tree();
			Node root = t.makeTree(arr);
			insertInBST(root, key);
			t.inOrder(root);

		}
	}

}
