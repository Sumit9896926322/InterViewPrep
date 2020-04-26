package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class PossibleTrinangle {

	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

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
			BigInteger k = BigInteger.valueOf(n);

			BigInteger factu = factorial(k);
			BigInteger factl = factorial(k.subtract(BigInteger.valueOf(3)));
			System.out.println(factu + " " + factl);
			BigInteger ans = factu.divide(factl);
			System.out.println(ans.divide(BigInteger.valueOf(6)));

		}
	}

}
