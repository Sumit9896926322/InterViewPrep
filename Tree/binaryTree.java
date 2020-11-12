package Tree;

import java.io.*;
import java.util.*;
import Tree.*;

public class binaryTree {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Node root = null;
	static Tree t = new Tree();


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

	public static void insert(Node temp, int data) {
		Queue<Node> q = new LinkedList<Node>();

		if(root == null) {
			root = new Node(data);
			return;
		}
		
		Node temp1 = new Node(data);
		q.add(temp);

		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr.left != null)
				q.add(curr.left);
			else {
				curr.left = temp1;
				break;
			}

			if (curr.right != null)
				q.add(curr.right);
			else {
				curr.right = temp1;
				break;
			}

		}

	}

	public static void deletedeepest(Node root, Node deepest) {
		// Deleting the last element in level order traversal
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		while (!q.isEmpty()) {
			temp = q.poll();

			if (temp == deepest) {
				temp = null;
				return;
			}

			if (temp.left != null) {
				if (temp.left == deepest) {
					temp.left = null;
					return;
				}
				q.add(temp.left);
			}

			if (temp.right != null) {
				if (temp.right == deepest) {
					temp.right = null;
					return;
				}
				q.add(temp.right);
			}

		}

	}

	public static void delete(Node root, int key) {
		// Replace the key data from rightmost node
		Node target = null;
		Node temp = null;
		Node lastnode = null;
		Node pl = null;// left child's parent
		Node pr = null;// right child's parent

		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			root = null;
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			temp = q.poll();

			if (temp.data == key)
				target = temp;

			if (temp.left != null) {
				pl = temp;
				pr = null;
				q.add(temp.left);
			}

			if (temp.right != null) {
				pl = null;
				pr = temp;
				q.add(temp.right);
			}
		}
		target.data = temp.data;
		if (pl != null)
			pl.left = null;
		if (pr != null)
			pr.right = null;

		// One more traversal for deleting the last node in tree
		// deletedeepest(root, temp);

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {
			int x = nextInt();
			int arr[] = nextArr();

			root = t.makeTree(arr);
			delete(root,x);
			t.inOrder(root);
			System.out.println();

		}
	}

}
