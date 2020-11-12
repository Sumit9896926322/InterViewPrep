package Tree;

public class Node {
	public int data;
	public Node left, right;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
	}
}
