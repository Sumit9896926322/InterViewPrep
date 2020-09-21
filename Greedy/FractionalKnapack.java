package Greedy;

import java.io.*;
import java.util.*;

class Bag {
	int value;
	int weight;

	Bag(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}

}

class Bagcmp implements Comparator<Bag> {
	public int compare(Bag bag1, Bag bag2) {
		return (bag2.value / bag2.weight) - (bag1.value / bag1.weight);
	}
}
public class FractionalKnapack {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int[] sortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] desortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a, Collections.reverseOrder());

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
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

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int input[] = nextArr();
			int n = input[0];
			int capacity = input[1];
			int arr[] = nextArr();
			Bag bags[] = new Bag[n];

			for (int i = 0; i < arr.length; i += 2)
				bags[i / 2] = new Bag(arr[i], arr[i + 1]);

			Arrays.sort(bags, new Bagcmp());

			for (Bag bag : bags) {
				System.out.println(bag.value + " " + bag.weight);
			}
			System.out.println();
			float ans = 0;
			for (int i = 0; i < bags.length; i++) {


				if (bags[i].weight <= capacity) {
					ans += bags[i].value;
					capacity -= bags[i].weight;
				} else {
					ans += ((float) (bags[i].value / bags[i].weight)) * capacity;
					break;
				}

			}
			System.out.printf("%.2f", ans);

		}
	}

}
