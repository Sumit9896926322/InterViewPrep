package Sorting;

import java.io.*;
import java.util.*;

public class MeetingMaxDGuests {

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

			int n = nextInt();
			int arr[] = nextArr();
			int dep[] = nextArr();

			Arrays.sort(arr);
			Arrays.sort(dep);
			int i = 0, j = 0;
			int mostPeople = 0;
			int curr = 0;
			int ansinTime = -1;
			while (i < arr.length && j < dep.length) {
				if (arr[i] <= dep[j]) {
					curr++;
					i++;
				} else {
					curr--;
					j++;
				}
				if (curr > mostPeople) {
					ansinTime = arr[i];
					mostPeople = curr;
				}
//				mostPeople = Math.max(mostPeople, curr);
			}
			System.out.println(ansinTime);

		}
	}

}
