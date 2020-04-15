package GFG.Hashing;

import java.io.*;
import java.util.*;


public class SmallDistinctWindow {

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
			char arr[] = n.toCharArray();
			Set<Character> s = new HashSet<Character>();

			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

			for (char i : arr)
				s.add(i);

			// Value will hold distinct elements
			int value = s.size();


			int ans = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; i++) {
				hash.put(arr[i], i);
				if (hash.keySet().size() >= value) {
					ArrayList<Integer> check = new ArrayList<Integer>(hash.values());
					int cans = Collections.max(check) - Collections.min(check);
					cans += 1;
					ans = Math.min(ans, cans);

					if (ans == hash.keySet().size())
						break;

				}
			}

			System.out.println(ans);
		}

	}
}
