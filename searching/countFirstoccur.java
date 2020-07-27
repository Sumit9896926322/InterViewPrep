package searching;

import java.io.*;
import java.util.*;

public class countFirstoccur {

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

	public static long[] nextLongArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		long arr[] = new long[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Long.parseLong(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

//Count first index in sorted array	
	public static int countFI(int arr[], int elem, int low, int mid, int high) {

		if (low > high)
			return -1;

		if (elem < arr[mid])
			return countFI(arr, elem, low, (low + mid - 1) / 2, mid - 1);
		else if (elem > arr[mid])
			return countFI(arr, elem, mid + 1, (high + mid + 1) / 2, high);
		else {

			// mid > 0 && mid - 1 == 1 for counting 1 in sorted binary
			if (mid != 0 && arr[mid - 1] == elem)
				return countFI(arr, elem, low, (low + mid - 1) / 2, mid - 1);
			else
				return mid;

		}

	}

	public static int bsearch(int arr[], int elem, int low, int mid, int high) {

		if (low > high)
			return -1;

		if (elem < arr[mid])
			return bsearch(arr, elem, low, (low + mid - 1) / 2, mid - 1);
		else if (elem > arr[mid])
			return bsearch(arr, elem, mid + 1, (high + mid + 1) / 2, high);
		else
			return mid + 1;

	}

//Count Last index in sorted array	
	public static int countLI(int arr[], int elem, int low, int mid, int high) {

		if (low > high)
			return -1;

		if (elem < arr[mid])
			return countLI(arr, elem, low, (low + mid - 1) / 2, mid - 1);
		else if (elem > arr[mid])
			return countLI(arr, elem, mid + 1, (high + mid + 1) / 2, high);
		else {

			if (mid != arr.length - 1 && arr[mid + 1] == elem)
				return countLI(arr, elem, mid + 1, (high + mid + 1) / 2, high);
			else
				return mid;


		}

	}

//Count occurence of repeated elements
	public static int countocurrence(int arr[], int elem, int low, int mid, int high) {
		int fi = countFI(arr, elem, 0, (arr.length - 1) / 2, arr.length - 1);

		if (fi == -1)
			fi = 0;
		int li = countLI(arr, elem, 0, (arr.length - 1) / 2, arr.length - 1);

		return (li - fi + 1);
	}

//Count 1 in sorted binary arr
	public static int countoneBinary(int arr[], int elem, int low, int mid, int high) {
		int fi = countFI(arr, elem, 0, (arr.length - 1) / 2, arr.length - 1);

		if (fi == -1)
			fi = 0;
		int li = countLI(arr, elem, 0, (arr.length - 1) / 2, arr.length - 1);

		return (li - fi + 1);
	}

	public static int squareRoot(int x, int low, int mid, int high) {
		if (low >= high)
			return mid;
		if (mid * mid < x)
			return squareRoot(x, mid + 1, (mid + 1 + high) / 2, high);
		else if (mid * mid > x)
			return squareRoot(x, low, (low + mid - 1) / 2, mid - 1);
		else
			return mid;

	}

	// Element which is greater than its neighbour
	public static int peekElement(int arr[], int low, int mid, int high) {
		if (low > high)
			return -1;
		if (mid == 0 && arr[mid] >= arr[mid + 1])
			return arr[mid];
		if (mid == arr.length - 1 && arr[mid] >= arr[mid - 1])
			return arr[mid];
		if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1])
			return arr[mid];
		if (mid > 0 && arr[mid - 1] > arr[mid])
			return peekElement(arr, low, (low + mid - 1) / 2, mid - 1);
		return peekElement(arr, mid + 1, (mid + 1 + high) / 2, high);
	}

	public static int searchRotated(int arr[], int elem, int low, int mid, int high) {
		while (low <= high) {
			mid = (low + high) / 2;

			if (low > high)
				return -1;

			if (arr[mid] == elem)
				return mid + 1;

			if (arr[mid] < elem) {
				if (arr[mid + 1] <= elem && elem <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}

			if (arr[mid] > elem) {
				if (arr[low] <= elem && elem <= arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}

		}
		return -1;
	}

	// Two pointer approach to find pair results into sum
	public static String findPair(int arr[], int sum) {
		int low = 0, high = arr.length - 1;
		while (low < high) {
			if (arr[low] * arr[high] < sum)
				++low;
			else if (arr[low] * arr[high] > sum)
				--high;
			else
				return arr[low] + " " + arr[high];
		}
		return "false";
	}

	// Two pointer approach to find triplets results into sum
	public static String findTriplets(int arr[], int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String ans = "";
				if ((ans = findPair(Arrays.copyOfRange(arr, j, arr.length), arr[i]*arr[i])) != "false") {
					
					return arr[j] + " " + ans;
				}
			}

		}
		return "false";
	}

	public static long floorsearch(long arr[], int x) {
		int left = 0, right = arr.length - 1;
		int mid = (left + right) / 2;

		while (left <= right) {
			if (left > right)
				return -1;
			if (arr[mid] == x)
				return mid;

			if (arr[mid] < x) {
				if (mid == arr.length - 1 || arr[mid + 1] > x)
					return mid;
				else
					left = mid + 1;
			}

			if (arr[mid] > x)
				right = mid - 1;

			mid = (left + right) / 2;
		}
		return -1;
	}

	public static int repeatInSorted(int arr[], int low, int high) {

		while (low < high) {
			int mid = (low+high)/2;
			
			if(low > high)
				return -1;
			
			if(mid != 0 && arr[mid] == arr[mid-1]||mid!=arr.length-1 && arr[mid]== arr[mid+1]) {
				return arr[mid];
			}
			if (arr[mid] == mid + arr[0])
				low = mid+1;
			else
				high = mid-1;
			
		}
		return -1;
	
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			int low = 0;
			int high = arr.length - 1;
			int mid = (low + high) / 2;
			int missingElement = -1;
			missingElement = repeatInSorted(arr, low, high);
			System.out.println(missingElement + " "
					+ countocurrence(arr, missingElement, 0, (arr.length - 1) / 2, arr.length - 1));
//			System.out.println(peekElement(arr, 0, (n - 1) / 2, n - 1));

		}
	}

}
