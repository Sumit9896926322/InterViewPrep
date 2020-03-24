package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Divioson8 {
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
			String arr[] = next().split("");
			ArrayList<Integer> res = new ArrayList<Integer>();
			StringBuilder str = new StringBuilder();
			String last = "";
			Boolean flag = false;
			BigInteger eight = new BigInteger("8");

			for (int i = 0; i < arr.length; i++) {
				res.add(Integer.parseInt(arr[i]));
				str.append(arr[i]);
			}

			q: for (int k = 0; k < arr.length; k++) {
				for (int i = 0; i < res.size(); i++) {
					for (int j = 0; j < res.size(); j++) {
						if (j == i || j == k || i == k)
							continue;

						BigInteger number = new BigInteger(res.get(i) + "" + res.get(j) + "" + res.get(k));
						if (number.remainder(eight).equals(BigInteger.ZERO)) {
							flag = true;
							break q;
						}
					}
				}

			}
			// for strings length equal to 2
			if (new BigInteger(str.toString()).remainder(eight).equals(BigInteger.ZERO)
					|| new BigInteger(str.reverse().toString()).remainder(eight).equals(BigInteger.ZERO)) {
				System.out.println("YES");
				continue;
			}
			System.out.println(flag ? "YES" : "NO");
		}
	}

}

