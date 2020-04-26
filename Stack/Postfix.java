package GFG.GFG.Stack;

import java.util.*;
import java.io.*;

public class Postfix {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
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
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int priority(char exp) {
		if (exp == '^')
			return 3;
		else if (exp == '*' || exp == '/')
			return 2;
		else if (exp == '+' || exp == '-')
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {
			String exp = "(" + next() + ")";
			Stack<Character> st = new Stack<Character>();
			String ans = "";
			String operators = "+-/*^";

			// one + sign is goining to the left
			int i = 1;
			st.push(exp.charAt(0));

			while (!st.empty()) {
				char val = exp.charAt(i);
				if (operators.contains(val + "")) {
					/*
					 * High or equal priority operator exists in stack
					 */
					while (priority(st.peek()) >= priority(val)) {
						if (st.empty())
							break;
						else
						ans += st.pop();
					}

					st.push(val);

				} else if (val == ')') {
					/*
					 * Popping elements while expression completes(...)
					 */
					while ((val = st.pop()) != '(') {
						ans += val;
					}
				} 
				else if (val == '(')
					st.push(val);

				else
					ans += val;

				i++;
			}
			System.out.println(ans);
		}
	}

}
