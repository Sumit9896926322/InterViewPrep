package random;

import java.io.*;

public class specialTriplets {
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
	
	public static int calculateLaps(int starting,int step,int limit) {
		int incr = 0;
		int ans = 1;
		while(starting+step*incr<limit) {
			starting = starting+step*incr; 
			if(starting<=limit) {
				ans+=incr;
				incr++;
			}
		}
		while(starting+step<=limit) {
			starting+=step;
			ans++;
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		int t = nextInt();
		while (t-- > 0) {
			int n = nextInt();
			int ans = 0;
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						int count = j;
						int b = 0;
						ans+=(n-(j-i))/i;
						  
					}
				 
				}
			}
		
			System.out.println(ans);
		}
	}
}
