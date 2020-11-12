package backtracking;

import java.util.Scanner;

public class ratmultiplejumps {

	static int ans[][];
	static int max;

	public static void copy(int dest[][]) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++)
				ans[i][j] = dest[i][j];
		}
	}

	public static void solve(int m[][], int path[][], int i, int j, int steps) {

		int row = m.length;
		int col = m[0].length;

		if (i < 0 || j < 0 || i >= row || j >= col || m[i][j] == 0 || path[i][j] == 1)
			return;

		if (i == row - 1 && j == col - 1) {
			path[i][j] = 1;
			if (steps < max) {
				copy(path);// Copy min dest array to ans
				max = steps;
			}
			path[i][j] = 0;
			return;
		}

		for (int k = 1; k <= m[i][j]; k++) {
			path[i][j] = 1;

			solve(m, path, i, j + k, steps + 1);
			solve(m, path, i + k, j, steps + 1);

			path[i][j] = 0;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while (t-- > 0) {

			int n = s.nextInt();
			max = Integer.MAX_VALUE;
			ans = new int[n][n];
			int maze[][] = new int[n][n];
			int sol[][] = new int[n][n];

			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[i].length; j++)
					maze[i][j] = s.nextInt();
			}

			solve(maze, sol, 0, 0, 0);
			
			if (max == Integer.MAX_VALUE)
				System.out.println(-1);
			else {

			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[i].length; j++)
					System.out.print(ans[i][j] + " ");
				System.out.println();
			}
			}

		}

}
}