package Arraymatrix;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while (t-- > 0) {
			int m = s.nextInt();
			int n = s.nextInt();
			StringBuilder ans = new StringBuilder();

			int arr[][] = new int[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = s.nextInt();
			}

			int left = 0;
			int right = n - 1;
			int top = 0;
			int down = m - 1;
			int size = m * n;
			int count = 0;
			while (count < size) {
				for (int i = left; i <= right && (count < size); i++) {
					ans.append(arr[top][i] + " ");
					count++;
			}
			top++;

				for (int i = top; i <= down && (count < size); i++) {
					ans.append(arr[i][right] + " ");
					count++;

			}
			right--;

				for (int i = right; i >= left && (count < size); i--) {
					ans.append(arr[down][i] + " ");
					count++;
			}
			down--;

				for (int i = down; i >= top && (count < size); i--) {
					ans.append(arr[i][left] + " ");
					count++;
			}
			left++;
			}

			System.out.println(ans);


		}

}
}