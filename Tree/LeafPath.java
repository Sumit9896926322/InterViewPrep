package Tree;

import java.io.*;
import java.util.*;
import Tree.*;
public class LeafPath {

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

	static Stack<Node> st;
	static ArrayList<ArrayList<Integer>> arr1;
	static ArrayList<Integer> res;

	public static void leafPath(Node root) {

		if (root == null)
			return;

		res.add(root.data);

		if (root.left == null && root.right == null) {
			arr1.add(new ArrayList<Integer>(res));
		}


		leafPath(root.left);
		leafPath(root.right);
		if (res.size() > 0)
			res.remove(res.size() - 1);
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			Tree t = new Tree();
			arr1 = new ArrayList<ArrayList<Integer>>();
			res = new ArrayList<Integer>();
			int n = nextInt();
			int arr[] = nextArr();
			st = new Stack<Node>();
			Node root = t.makeTree(arr);

			String str = "";
			leafPath(root);
			for (int i = 0; i < arr1.size(); i++) {
				System.out.println(arr1.get(i));
			}

		}
	}

}
