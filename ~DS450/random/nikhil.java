package random;

import java.io.*;
import java.util.*;

public class nikhil {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer> ans  = new ArrayList<Integer>();

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


	public static void main(String[] args) throws IOException {

		int T = 1;
		int prefix10 = 0;
		T = nextInt();
		
		for(int i = 1;i<=2000;i++) {
			if(i%10 == 0)
				prefix10 = i;
			if(i%3 != 0 && i-prefix10 !=3)
				ans.add(i);
			
		}
		while (T-- > 0) {

			int n = nextInt();
			System.out.println(ans.get(n-1));
		}
	}

}
