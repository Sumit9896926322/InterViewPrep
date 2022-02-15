package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	static Node root = null;

	public static Node makeTree(int arr[]) {
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
	public static int Height(Node root){
		if(root == null){
			return 0;
		}

		int lh = Height(root.left);
		int rh = Height(root.right);

		return 1+Math.max(lh,rh);
	}

	public static void main(String[] args) {

	}

}
