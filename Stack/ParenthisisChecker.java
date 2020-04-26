package GFG.GFG.Stack;
import java.util.*;
import java.io.*;

public class ParenthisisChecker {

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

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			String s = next();
			Stack<Character> st = new Stack<Character>();
			char match = ' ';
			Boolean isBalance = true;


			 for (char i : s.toCharArray()) {

				if (i == '}')
					match = '{';
				else if (i == ')')
					match = '(';
				else if (i == ']')
					match = '[';
				else {
					st.push(i);
					continue;
				}

				if (!st.empty()) {
					if (st.peek() == match) {
						st.pop();
					} else {
						break;
					}
				} else {
					isBalance = false;
					break;
				}

			}

			System.out.println(st.empty() && isBalance ? "balanced" : "not balanced");

		}
	}

}
