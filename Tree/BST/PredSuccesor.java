package Tree.BST;

import java.io.*;
import java.util.*;
import Tree.*;

public class PredSuccesor {
	int predecessor;
	int successor;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Boolean isPredecessorFound;
	PredSuccesor() {
		predecessor = -1;
		successor = -1;
	}
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

	public static void find(Node root, int key, PredSuccesor p) {
		if (root == null)
			return;

		find(root.left, key, p);

		if (root.data < key) {
			p.predecessor = root.data;
			isPredecessorFound = true;
		}
		if (isPredecessorFound && root.data > key) {
			p.successor = root.data;
			isPredecessorFound = false;
		}

		find(root.right, key, p);

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
			PredSuccesor p = new PredSuccesor();
			isPredecessorFound = false;

			find(root, key, p);

			if (p.predecessor == -1 || p.successor == -1)
				System.out.println(-1);
			else
				System.out.println(p.predecessor + " " + p.successor);

		}
	}

}
