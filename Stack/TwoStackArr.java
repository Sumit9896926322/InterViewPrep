package GFG.GFG.Stack;

import java.util.*;

class TwoStackArr {

	int size;
	int top1, top2;
	// int arr[] = new int[size];
	int arr[] = new int[100];

	TwoStackArr() {
		int n = 100;
		size = n;
		// arr[] = new int[n];
		top1 = -1;
		top2 = size;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			TwoStackArr sq = new TwoStackArr();

			int Q = sc.nextInt();
			while (Q > 0) {
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();

				Stacks g = new Stacks();

				if (QueryType == 1) {
					int a = sc.nextInt();
					if (stack_no == 1)
						g.push1(a, sq);
					else if (stack_no == 2)
						g.push2(a, sq);
				} else if (QueryType == 2) {
					if (stack_no == 1)
						System.out.print(g.pop1(sq) + " ");
					else if (stack_no == 2)
						System.out.print(g.pop2(sq) + " ");
				}

				Q--;
			}
			System.out.println();
			T--;
		}
	}
}

class Stacks {

	void push1(int x, TwoStackArr sq) {
		sq.arr[++sq.top1] = x;
	}

	/* The method push to push element into the stack 2 */
	void push2(int x, TwoStackArr sq) {
		sq.arr[--sq.top2] = x;
	}

	/* The method pop to pop element from the stack 1 */
	// Return the popped element
	int pop1(TwoStackArr sq) {
		int elem = 0;
		if (sq.top1 == -1)
			elem = -1;
		else
			elem = sq.arr[sq.top1--];
		return elem;
	}

	/* The method pop to pop element from the stack 2 */
	// Return the popper element
	int pop2(TwoStackArr sq) {
		int elem = 0;
		if (sq.top2 == 100)
			elem = -1;
		else
			elem = sq.arr[sq.top2++];
		return elem;
	}
}

