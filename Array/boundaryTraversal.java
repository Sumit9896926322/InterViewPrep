import java.util.Scanner;

public class boundaryTraversal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while (t-- > 0) {
			int n = s.nextInt();
			StringBuilder ans = new StringBuilder();

			int arr[][] = new int[n][n];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++)
					arr[i][j] = s.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i == 0 || i == arr.length - 1)
						ans.append(arr[i][j] + " ");
					else {
						if (j == 0 || j == arr.length - 1)
							ans.append(arr[i][j] + " ");
					}
				}
			}
			System.out.println(ans);
		}

	}
}