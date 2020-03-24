package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palinArray {

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
			int n = nextInt();
			int arr[] = nextArr();
			int left = 0, right = n - 1;
			int leftsum = arr[0], rightsum = arr[n - 1];
			int ans = 0;
			while (left < right) {
				if (leftsum == rightsum) {
					++left;
					--right;
					leftsum = arr[left];
					rightsum = arr[right];
				}
				else if (leftsum < rightsum) {
					leftsum += arr[++left];
					ans++;

				} else {
					rightsum += arr[--right];
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

}
