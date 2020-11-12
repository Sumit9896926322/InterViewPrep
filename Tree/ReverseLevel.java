package Tree;

import java.io.*;
import java.util.*;
import Tree.*;

public class ReverseLevel {

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

	private static void reverseLevel(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> st = new Stack<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node curr = q.poll();
			st.push(curr);

			if (curr.right != null)
				q.add(curr.right);

			if (curr.left != null)
				q.add(curr.left);


		}
		while (!st.empty())
			System.out.print(st.pop().data + " ");
		System.out.println();

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();
			Tree t = new Tree();
			Node root = t.makeTree(arr);
			reverseLevel(root);

		}
	}

}
