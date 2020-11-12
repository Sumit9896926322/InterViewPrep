package Tree;

import java.io.*;
import java.util.*;
import Tree.*;

public class MirrorTree {

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

	public static void mirrorTree(Node root) {

		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.poll();
			Node leftChild = null;
			Node rightChild = null;

			if (temp.left != null) {
				q.add(temp.left);
				leftChild = temp.left;
			}

			if (temp.right != null) {
				q.add(temp.right);
				rightChild = temp.right;
			}

			temp.left = rightChild;
			temp.right = leftChild;

		}

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
			mirrorTree(root);
			t.levelOrder(root);

		}
	}

}
