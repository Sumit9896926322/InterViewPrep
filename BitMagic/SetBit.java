package BitMagic;

import java.util.*;

public class SetBit {
	static int count = 1;

//Efficient
//	public static int getFirstSetBitPos(int n) {
//		return (int) ((Math.log10(n & -n)) / Math.log10(2)) + 1;
//	}

	public static int setBit(int n) {

		if (n >= 1) {
			count++;
			// Checking last bit
			if ((n & 1) == 1)
				return count;

			return setBit(n >> 1);
			// Calling with half the number
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t-- > 0) {

			int n = s.nextInt();
			int count = 0;
			for (int i = 0; i <= n; i++) {
				count += i & (i + 1);
				System.out.println(count);
			}
			System.out.println(count);
		}

	}
}
