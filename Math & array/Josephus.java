package GFG;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Josephus {

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
			Scanner s = new Scanner(System.in);

			float h = s.nextFloat();
			float m = s.nextFloat();
			double ans = (5d / 60d) * m;
			double move = Math.abs(ans - (m % 5)) * 6;

			float res = Math.abs(h - m / 5) * 30;
			res -= (int) move;
			System.out.println(Math.abs(Math.min(res, 360 - res)));
         
			
//			private static void swap(char[] ch, int i, int j)
//			{
//
//			}
//
//			// Recursive function to generate all permutations of a String
//			private static void permutations(char[] ch, int currentIndex)
//			{
//
//			}
		}
	}

}
