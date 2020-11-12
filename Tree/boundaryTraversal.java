package Tree;

import java.io.*;
import java.util.*;

public class boundaryTraversal {

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

	public static void boundaryTraversal(Node root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			int qsize = q.size();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < qsize; i++) {
				Node curr = q.poll();
				arr.add(curr.data);

				if (curr.left != null)
					q.add(curr.left);

				if (curr.right != null)
					q.add(curr.right);
			}
			res.add(arr);
		}
		System.out.println(res);
		for (int i = 0; i < res.size(); i++) {
			if (i == res.size() - 1) {
				for (int j = 0; j < res.get(i).size(); j++)
					System.out.println(res.get(i).get(j));
			} else
				System.out.println(res.get(i).get(0));
		}
		for (int i = res.size() - 2; i > 0; i--) {
			int size = res.get(i).size();
			if (size > 1)
				System.out.println(res.get(i).get(size - 1));
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
			boundaryTraversal(root);
		}
	}

}
