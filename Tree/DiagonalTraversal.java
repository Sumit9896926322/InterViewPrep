package Tree;

import java.io.*;
import java.util.*;

public class DiagonalTraversal {

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

	static TreeMap<Integer, ArrayList<Integer>> hash;

	public static void diagonalTraversal(Node root) {
		if (root == null)
			return;

		Queue<NodeHeight> q = new LinkedList<NodeHeight>();

		NodeHeight temp = new NodeHeight(root, 0);
		q.add(temp);

		while (!q.isEmpty()) {
			NodeHeight curr = q.poll();

			if (hash.containsKey(curr.height)) {
				hash.get(curr.height).add(curr.node.data);
			} else {
				hash.put(curr.height, new ArrayList<Integer>());
				hash.get(curr.height).add(curr.node.data);
			}
			if (curr.node.left != null)
				q.add(new NodeHeight(curr.node.left, curr.height - 1));

			if (curr.node.right != null)
				q.add(new NodeHeight(curr.node.right, curr.height));

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
			hash = new TreeMap<Integer, ArrayList<Integer>>(Collections.reverseOrder());

			diagonalTraversal(root);

			System.out.println(hash);
			hash.descendingMap();

			for (Map.Entry<Integer, ArrayList<Integer>> elem : hash.entrySet()) {
				ArrayList<Integer> res = new ArrayList<>(elem.getValue());
				for (int i = 0; i < res.size(); i++)
					System.out.print(elem.getValue().get(i) + " ");

			}
			System.out.println();

		}
	}

}
