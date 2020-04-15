package GFG.Hashing;

import java.io.*;
import java.util.*;

public class FirstNonRepeat {

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
			if (n == 1) {
				System.out.println(br.readLine());
				continue;
			}

			String arr[] = next().split(" ");
			ArrayList<String> res = new ArrayList<String>();
			HashMap<String, Integer> person = new HashMap<String, Integer>();
			Boolean found = false;
			for (int i = 0; i < arr.length; i++) {
				if (!person.containsKey(arr[i]))
					person.put(arr[i], 1);
				else {
					if (person.get(arr[i]) == 1)
						res.add(arr[i]);
					person.put(arr[i], person.get(arr[i]) + 1);
				}
			}
			System.out.println(person);
			System.out.println(res);
			int max = Collections.max(person.values());
			for (int i = arr.length - 1; i > 0; i--) {
				if (person.get(arr[i]) == max) {
					System.out.println(arr[i]);
					break;
				}

			}
			
		}
	}

}
