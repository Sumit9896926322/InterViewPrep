package Tree;

import java.io.*;
import java.util.*;
import Tree.*;

public class TraversalByStack {

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

	public static void inOrderStack(Node root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;

		Stack<Node> st = new Stack<Node>();
		st.push(root);

		while (!st.empty()) {
			Node temp = st.pop();

			while (temp != null) {
				st.push(temp);
				temp = temp.left;
			}

			while (!st.empty() && st.peek().right == null) {
				System.out.print(st.peek().data + " ");
				st.pop();
			}

			if (!st.empty()) {
				Node head = st.pop();
				System.out.print(head.data + " ");
				if (head.right != null) {
					st.push(head.right);
				}
			}


		}
	}

	public static void preOrderStack(Node root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			System.out.println(root.data);
			return;
		}

		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while (!st.empty()) {
			Node temp = st.pop();
		while (temp != null) {
			System.out.println(temp.data);
			st.push(temp);
			temp = temp.left;
		}
		while (!st.empty() && st.peek().right == null)
			st.pop();

		if (!st.empty()) {
			Node head = st.pop();
			if (head.right != null)
				st.push(head.right);
			}
		}
	}

	public static void postOrderStack(Node root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			System.out.println(root.data);
			return;
		}

		Stack<Node> st = new Stack<Node>();
		st.push(root);

		while (!st.empty()) {
			Node temp = st.pop();

			while (temp != null) {
				if (temp.right != null)
					st.push(temp.right);
				st.push(temp);
				temp = temp.left;
			}

			if (!st.empty()) {
				temp = st.pop();
				while (temp.right == null) {
					System.out.println(temp.data);
					temp = st.pop();
				}

				if (!st.empty() && temp.right == st.peek()) {
					st.pop();
					st.push(temp);
				}

			}
		}
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			Tree t = new Tree();
			int n = nextInt();
			int arr[] = nextArr();
			Node root = t.makeTree(arr);
			postOrderStack(root);

		}
	}

}
