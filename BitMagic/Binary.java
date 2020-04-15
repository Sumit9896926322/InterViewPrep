package BitMagic;

import java.util.*;

public class Binary {
	static String binary = "";

	public static void convertBinary(int n) {

		if (n >= 1)
			convertBinary(n / 2);
		binary += n % 2;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		// n&1 == 0 even else odd
		while (t-- > 0) {
			binary = "";
			int n = s.nextInt();
			convertBinary(n);
			for (int i = 0; i < 14; i++) {
				if (i >= 14 - binary.length()) {
					System.out.print(1 & binary.charAt(Math.abs(14 - binary.length() - i)));
				} else
					System.out.print(1 & 0);
			}
		}
	}
}
