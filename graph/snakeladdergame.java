package graph;

import java.io.*;
import java.util.*;

public class snakeladdergame {

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

	static int board[];

	public static int max(int board[], int pos) {
		ArrayList<Integer> validPos = new ArrayList<Integer>();
		for (int i = pos; i < pos + 6; i++) {

			if (board[i] == -1)
				continue;

			if (i < board.length) {
				board[i] = -1;
				validPos.add(board[i]);
			}

		}
		return Collections.max(validPos);
	}

	public static int countmoves(int board[], int pos, int ans) {

		if (pos == 100)
			return ans;
		if (pos == -1)
			return -1;

		if (board[pos] == -1)
			return -1;

		pos = max(board, pos);
		System.out.println(pos);
		ans++;

		return countmoves(board, pos, ans);
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			board = new int[100];

			for (int i = 1; i <= 100; i++)
				board[i] = i;

			int snakeCount = nextInt();
			for (int i = 0; i < snakeCount; i++) {
				int snakes[] = nextArr();
				board[snakes[0]] = snakes[1];
			}

			int ladderCount = nextInt();
			for (int i = 0; i < ladderCount; i++) {
				int ladders[] = nextArr();
				board[ladders[0]] = ladders[1];
			}
			int ans = countmoves(board, board[0], 0);
			System.out.println(ans);
		}
	}

}
