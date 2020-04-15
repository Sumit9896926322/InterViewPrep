package GFG.Hashing;
/*Do it Later*/

import java.util.*;
import java.io.*;

public class AnotherStringWindow {

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
			String n = next();
			String s = next();
			int ans = Integer.MAX_VALUE;
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
			Set<Character> q = new HashSet<Character>();
			for (char i : s.toCharArray())
				q.add(i);
			int upto = q.size();
			int smax = 0, smin = 0;

			for (int i = 0; i < n.length(); i++) {

				if (s.contains(n.charAt(i) + ""))
					hash.put(n.charAt(i), i);

				if (hash.keySet().size() >= upto) {
					ArrayList<Integer> arr = new ArrayList<Integer>(hash.values());

					int max = Collections.max(arr);
					int min = Collections.min(arr);
					int currans = max - min;
					currans += 1;

					if (currans < ans) {
						smax = max;
						smin = min;
					}
					ans = Math.min(ans, currans);

					// No smaller string can be found other than this
					if (currans == s.length())
						break;
				}

			}
			String ans1 = "";
			for (int i = smin; i <= smax; i++)
				ans1 += n.charAt(i);

			System.out.println(ans1.length() == 1 ? -1 : ans1);
		}
	}

}
