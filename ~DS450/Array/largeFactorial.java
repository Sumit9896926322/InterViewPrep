package array;

import java.util.*;

public class largeFactorial {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		for (int i = 1; i <= 20; i++) {
			int carry = 0;
			for (int j = arr.size() - 1; j >= 0; j--) {
				int res = i * arr.get(j) + carry;
				if (res >= 10)
					carry = res / 10;
				else
					carry = 0;
				arr.set(j, res % 10);

				if (res >= 10 && j == 0) {
					int temp = res/10;
					while(temp > 0) {
						arr.add(j,temp%10);
						temp/=10;
					}
				}

			}
			System.out.println(arr);
		}
	}
}
