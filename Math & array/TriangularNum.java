package GFG;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class ZeroInFact {
	static int i = 0;
	static int temp;
	static ArrayList<Integer> s = new ArrayList<Integer>();

	public static int triangular(int n) {
		if (n < 0)
			return 0;
		if (n == 0) {
			s.add(temp);
			return 1;
		}
		System.out.println(s);

		return triangular(n - (++i));
	}

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			i = 0;
			temp = n;
			System.out.println(triangular(n));
		}
	}
}

