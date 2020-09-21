package Array.SlidingWindow;

import java.io.*;
import java.util.*;

public class SubarraySum {

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

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static boolean threeequalParts(int arr[]) {
		   int sum = 0;
	        
	        for(int i = 0;i<arr.length;i++)
	         sum+=arr[i];
	        
	        sum /=3;
	        int count = 0;
	        int check = 0;
	        for(int j = 0;j<arr.length;j++){

	            check+=arr[j];
			
	            if(check == sum){
	                count++;
	                check = 0;
	            }
			System.out.println(check + " " + sum + " " + count);
	        }
	        return check == 3?true:false;
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int input[] = nextArr();

			int n = input[0];
			int k = input[1];

			int arr[] = nextArr();
			System.out.println(threeequalParts(arr));
			int sum = arr[0];


			s: for (int i = 1; i < arr.length; i++) {
				int left = i - 1, right = i - 1;
				while (left <= right && right < n) {
					if (sum == k) {
						System.out.println((left + 1) + " " + (right + 1));
						break s;
					}
					if (sum < k) {
						sum += arr[++right];
					} else {
						sum -= arr[left++];
					}



				}
			}

		}
	}

}
