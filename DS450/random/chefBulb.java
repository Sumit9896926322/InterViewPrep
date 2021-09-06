package random;

import java.io.*;
import java.util.ArrayList;

public class chefBulb {
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
	static ArrayList<ArrayList<Integer>> ans;
	public static int test(int n,int p,int k) {
		ans = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<n;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int j = i;
			while(j<=n-1) {
				temp.add(j);
				j+=k;
			}
			ans.add(temp);
		}
		System.out.println(ans);
		return ans.indexOf(p);
	}

	public static void main(String[] args) throws IOException {
		int t = nextInt();
		while (t-- > 0) {
			int input[] = nextArr();
			int n = input[0];
			int p = input[1];
			int k = input[2];
			int max = 10;
			int min = 1;
//			int n =  (int)(Math.random()*(max-min+1)+min);
//			int p =  (int)(Math.random()*(n-0+1)+0);
//			int k =  (int)(Math.random()*(max-min+1)+min);
		
			int round = p%k;
			int elem = n/k;
			int multiple = n%k;
			int ans = 0;
			if(round > 0) {
				if(n%k != 0)
				ans += (elem+1)*round;
				else
				ans+=elem*round;
			}
			
	
			while(round<=p) {
				ans++;
				round+=k;
			}
			int tans = test(n,p,k);
		
			System.out.println(ans+" "+tans+" ");
			if(ans != tans) {
			System.out.println(n+" "+p+" "+k);
				break;
			}
			
	}
}
}
