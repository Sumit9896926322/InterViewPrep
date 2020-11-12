package Arraymatrix;
import java.io.*;
import java.util.*;


public class beautifulMatrix {
	static int arr[] = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String ans = "";
		for (int i = 1; i < arr.length; i++)
			arr[i] = arr[i - 1] + isSuperDrome(i);

		int T = Integer.parseInt(br.readLine().trim());
		String input[] = br.readLine().split(" ");
		for (int t_i = 0; t_i < T; t_i++) {
			int n = Integer.parseInt(input[t_i]);

			int out_ = solve(n);
			ans += out_ + " ";

		}
		System.out.println(ans);
		wr.close();
		br.close();
	}

	public static String binary(int i) {
		if (i == 1)
			return "1";
		if (i == 0)
			return "0";
		return "" + (i % 2) + binary(i / 2);
	}

	public static boolean checkPallindrome(String s) {
		int low = 0, high = s.length() - 1;
		while (low <= high) {
			if (s.charAt(low++) != s.charAt(high--))
				return false;
		}
		return true;
	}

	public static int isSuperDrome(int i) {
		String s = i + "";
		String binaryForm = binary(i);
		if (checkPallindrome(s) && checkPallindrome(binaryForm))
			return 1;
		return 0;

	}

	static int solve(int n) {
		return arr[n];
	}
}