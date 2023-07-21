//package GFG.Tree;
//
//import java.util.*;
//
//public class oddevendiff {
//
//	static Queue<Node> level = new LinkedList<Node>();
//	static Stack<Tree> s = new Stack<Tree>();
//	static int ans = 0;
//	static int lc = 0;
//
//	static Stack<Tree> child = new Stack<Tree>();
//	static int max = -1;
//	static int dest = 4;
//	static int asap = 2;
//	static Node parent;
//	static Node head = null;
//
//
//	public static void kancestor(Node root, int k, int node) {
//		if (root == null)
//			return;
//
//		if (root.data == dest) {
//			System.out.println(node + " " + asap);
//			asap = k - asap;
//		}
//		kancestor(root.left, k + 1, root.data);
//		kancestor(root.right, k + 1, root.data);
//	}
//	public static void recurLeftView(Node root, int curr) {
//		if (root == null)
//			return;
//
//		if (curr > max)
//			System.out.println(root.data);
//		max = Math.max(max, curr);
//		recurLeftView(root.left, curr + 1);
//		recurLeftView(root.right, curr + 1);
//	}
//
//	public static int childSumPro(Node root) {
//		if (root.left == null && root.right == null) {
//			int temp = root.data;
//			root.data = 0;
//			return temp;
//		}
//		int lc = childSumPro(root.left);
//		int rc = childSumPro(root.right);
//		int temp2 = root.data;
//		root.data = lc + rc;
//
//		return temp2 + root.data;
//	}
//
//	public static void leftView(Node root) {
//		// Non Recursive
//		level.add(root);
//		while (!level.isEmpty()) {
//		int size = level.size();
//		int first = 0;
//			while (size-- > 0) {
//			Node elem = level.poll();
//			first++;
//			if (first == 1)
//				System.out.println(elem.data);
//			if (elem.left != null)
//				level.add(elem.left);
//			if (elem.right != null)
//				level.add(elem.right);
//
//		}
//		}
//	}
//
//	public static int Height(Node root) {
//		if (root == null)
//			return 0;
//		return Math.max(Height(root.left), Height(root.right)) + 1;
//	}
//
//
//	public static void kdistanceroot(Node root, int k) {
//		if (root == null)
//			return;
//		if (k == 0)
//			System.out.print(root.data + " ");
//		kdistanceroot(root.left, k - 1);
//		kdistanceroot(root.right, k - 1);
//	}
//
//	public static int TreeMax(Node root) {
//		if (root.left == null && root.right == null)
//			return root.data;
//
//		return Math.max(TreeMax(root.left), TreeMax(root.right));
//
//	}
//
//	public static void sumTree(Node root) {
//		if (root == null)
//			return;
//
//		int sum = 0;
//		sumTree(root.left);
//
//
//		if (root.left != null)
//			sum += root.left.data;
//		if (root.right != null)
//			sum += root.right.data;
//
//		root.data = sum;
//		System.out.println(root.data);
//		sumTree(root.right);
//
//	}
//
//	public static int maxdiff(int[] arr) {
//
//		int ans = 0;
//		int curr = 100;
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i - 1] == 0 && arr[i] == 1)
//				ans += 2;
//		}
//		ans = ans > 0 ? ans : -1;
//		return ans;
//
//	}
//
//	public static int flip(Node root) {
//		if (root == null)
//			return 0;
//		int l = flip(root.left);
//		int r = flip(root.right);
//		ans += Math.abs(l - r);
//		System.out.println(root.data + " " + ans);
//		root.data += l + r;
//		return root.data;
//	}
//	public static void diagonalSum(Node root) {
//		level.add(root);
//		while (!level.isEmpty()) {
//			Node elem = level.poll();
//
//			while (elem != null) {
//				if (elem != null)
//					ans += elem.data;
//
//				if (elem.left != null)
//					level.add(elem.left);
//				elem = elem.right;
//			}
//			System.out.println(ans);
//			ans = 0;
//			}
//	}
//
//	static int lans = 0, rans = 0;
//
//	public static void verticalWidth(Node root, int curr) {
//		if (root == null)
//			return;
//		lans = Math.min(lans, curr);
//		rans = Math.max(rans, curr);
//		verticalWidth(root.left, curr - 1);
//		verticalWidth(root.right, curr + 1);
//
//	}
//
//	static int found = 0;
//
//	public static boolean isCousins(Node root, int k, int l) {
//		Queue<Node> level = new LinkedList<Node>();
//		Node zero = new Node(0);
//		level.add(root);
//
//		while (!level.isEmpty()) {
//			int size = level.size();
//
//			ArrayList<Integer> elems = new ArrayList<Integer>();
//			for (Node n : level)
//				elems.add(n.data);
//			if (Collections.max(elems) == 0)
//				return false;
//			if (elems.contains(k) && !elems.contains(l))
//				return false;
//
//			if (!elems.contains(k) && elems.contains(l))
//				return false;
//
//			if (elems.contains(k) && elems.contains(l)) {
//				int kpos = elems.indexOf(k);
//				int lpos = elems.indexOf(l);
//				int diff = Math.abs(kpos - lpos);
//				if (diff >= 1)
//					return kpos / 2 != lpos / 2;
//				}
//			while (size-- > 0) {
//				Node elem = level.poll();
//				level.add(elem.left != null ? elem.left : zero);
//				level.add(elem.right != null ? elem.right : zero);
//
//				}
//			}
//		return false;
//	}
//	public static void widthOfTree(Node root) {
//		// The maximum number of nodes at any level
//		// Now changed to odd even level difference
//		level.add(root);
//		while (!level.isEmpty()) {
//			int levelElems = level.size();
//
//			while (levelElems > 0) {
//				Node elem = level.poll();
//				if (lc % 2 == 0) {
//					ans += elem.data;
//					System.out.println(elem.data + "odd");
//				} else {
//					System.out.println(elem.data + "even");
//					ans -= elem.data;
//
//				}
//
//				if (elem.left != null)
//					level.add(elem.left);
//				if (elem.right != null)
//					level.add(elem.right);
//				levelElems -= 1;
//			}
//			lc++;
//		}
//		System.out.println(ans);
//
//	}
//
//	public static void levelOrder(Node root) {
//		int mx = 0;
//		while (root != null) {
//			System.out.println(root.data);
//			if (root.left != null)
//				level.add(root.left);
//
//			if (root.right != null)
//				level.add(root.right);
//
//			root = level.poll();
//		}
//	}
//
//	public static void levelOrderByLine(Node root) {
//		level.add(root);
//		while (!level.isEmpty()) {
//			int size = level.size();
//
//			while (size-- > 0) {
//				Node elem = level.poll();
//				System.out.println(elem.data + " ");
//				if (elem.left != null)
//					level.add(elem.left);
//				if (elem.right != null)
//					level.add(elem.right);
//			}
//			System.out.print("$");
//		}
//	}
//
//	public static int diameter(Node root) {
//
//		if (root == null)
//			return 0;
//
//		int lh = diameter(root.left);
//		int rh = diameter(root.right);
//
//		ans = Math.max(ans, lh + rh + 1);
//		System.out.println(root.data + " " + ans);
//		return Math.max(lh, rh) + 1;
//	}
//
//	public static int evalTree(Node root) {
//		// Changed node structure
//		if (root == null)
//			return 0;
//
//		if (String.valueOf(root.data) == "+")
//			return evalTree(root.left) + evalTree(root.right);
//		else if (String.valueOf(root.data) == "-") {
//			System.out.println(evalTree(root.left));
//			return evalTree(root.left) - evalTree(root.right);
//
//		} else if (String.valueOf(root.data) == "*")
//			return evalTree(root.left) * evalTree(root.right);
//		else if (String.valueOf(root.data) == "/")
//			return evalTree(root.left) / evalTree(root.right);
//		else
//			return root.data;
//	}
//
//	public static void makeNull(Node root) {
//		if (root == null)
//			return;
//
//		makeNull(root.left);
//		System.out.print(root.data + " ");
//		makeNull(root.right);
//
//	}
//	public static void treetoDll(Node root) {
//
//		if (root == null)
//			return;
//
//		treetoDll(root.left);
//		if (root.left == null && root.right == null) {
//			if (head == null) {
//				head = root;
//			} else {
//				head.right = root;
//				root.left = head;
//				head = root;
//			}
//		     return;
//		}
//		treetoDll(root.right);
//	}
//
//	public static void main(String[] args) {
//
//		Node t1 = new Node(1);
//		Node t2 = new Node(2);
//		Node t3 = new Node(3);
//		Node t4 = new Node(4);
//		Node t5 = new Node(5);
//		Node t6 = new Node(6);
//		Node t7 = new Node(7);
//		Node t8 = new Node(8);
//		Node t9 = new Node(9);
//		Node t10 = new Node(10);
//
//		t1.left = t2;
//		t1.right = t3;
//
//		t2.left = t4;
//		t2.right = t5;
//
//		t5.right = t6;
//
//		diameter();
//
//
//		}
//}
//
