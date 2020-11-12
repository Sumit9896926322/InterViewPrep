package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.Node;
public class Tree {
	static Node root = null;

	public Node makeTree(int arr[]) {
		Queue<Node> q = new LinkedList<Node>();
		if (arr.length == 0 || arr[0] == -1)
			return null;

		root = new Node(arr[0]);
		q.add(root);
		int i = 1;
		while (!q.isEmpty() && i < arr.length) {
			Node curr = q.poll();

			if (arr[i] != -1) {
				Node left = new Node(arr[i]);
				curr.left = left;
				q.add(left);
			}
			i += 1;
			if (i >= arr.length)
				break;

			if (arr[i] != -1) {
				Node right = new Node(arr[i]);
				curr.right = right;
				q.add(right);
			}
			i += 1;

		}
		return root;
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

	public void levelOrder(Node root) {
		// level order traversal of tree

		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null)
				q.add(curr.left);

			if (curr.right != null)
				q.add(curr.right);

		}

	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {

	}

}
