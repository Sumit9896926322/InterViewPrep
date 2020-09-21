package Greedy;

import java.io.*;
import java.util.*;


class Activity implements Comparable<Activity> {
	int start, finish;

	Activity(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	public int compareTo(Activity a) {

		return this.finish - a.finish;
	}
}

public class ActivitySelction {

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

	public static String greedySelect(Activity arr[]) {
		Arrays.sort(arr);
		int i = 0;
		StringBuilder ans = new StringBuilder(arr[0].finish + " ");

		for (int j = 1; j < arr.length; j++) {
			if (arr[j].start >= arr[i].finish) {

				ans.append(arr[j].finish + " ");
				i = j;
			}
		}
		System.out.println(ans);
		return ans.toString();
	}
	public static int naiveSelect(Activity arr[], int i, int ans) {

		if (i >= arr.length - 1) {
			return ans;
		}
		System.out.println(arr[i].finish + " " + arr[i + 1].start);
		int inc = 0;
		if (arr[i].finish <= arr[i + 1].start) {
			inc = naiveSelect(arr, i + 1, ++ans);
		}
		int exc = naiveSelect(arr, i + 1, ans);
		return ans;

	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int start[] = nextArr();
			HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		
			int finish[] = nextArr();
			
			for (int i = 0; i < finish.length; i++) 
				hash.put(finish[i],i+1);
			
			Activity arr[] = new Activity[n];

			for (int i = 0; i < n; i++)
				arr[i] = new Activity(start[i], finish[i]);

			greedySelect(arr);

		}
	}

}
