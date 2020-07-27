package Sorting;

import java.io.*;
import java.util.*;

class Interval implements Comparable<Interval> {
	int start, finish;

	Interval(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	public int compareTo(Interval I) {
		return this.start - I.start;
	}
}

public class mergeOverlappingIntervals {

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
			Interval[] intervals = new Interval[n];
			ArrayList<Interval> result = new ArrayList<Interval>();

			for (int i = 0; i < n * 2; i += 2) {

				intervals[i / 2] = new Interval(arr[i], arr[i + 1]);
			}
			Arrays.sort(intervals);
			


			Interval temp = new Interval(intervals[0].start, intervals[0].finish);

			for (int i = 1; i < intervals.length; i++) {

				if (temp.finish >= intervals[i].start) {
					temp.start = Math.min(temp.start, intervals[i].start);
					temp.finish = Math.max(temp.finish, intervals[i].finish);
				}
				else {
					result.add(new Interval(temp.start, temp.finish));
					temp.start = intervals[i].start;
					temp.finish = intervals[i].finish;
				}

			}
			result.add(new Interval(temp.start, temp.finish));
			for (Interval interval : result)
				System.out.print(interval.start + " " + interval.finish + " ");

		}
	}

}
