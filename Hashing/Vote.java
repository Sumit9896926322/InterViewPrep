package GFG.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Vote {

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
			String arr[] = next().split(" ");
			TreeMap<String, Integer> person = new TreeMap<String, Integer>();

			for (int i = 0; i < arr.length; i++) {
				if (!person.containsKey(arr[i]))
					person.put(arr[i], 1);
				else {
					person.put(arr[i], person.get(arr[i]) + 1);
				}
			}
			int max = Collections.max(person.values());

			Iterator hmIterator = person.entrySet().iterator();

			while (hmIterator.hasNext()) {
				Map.Entry mapElement = (Map.Entry) hmIterator.next();
				if (max == (int) mapElement.getValue()) {
					System.out.print(mapElement.getKey() + " ");
					System.out.println(max);
					break;
				}
			}

		}
	}

}
