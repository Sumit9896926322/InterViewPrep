package array;

import java.util.Scanner;

public class SmallSubArrSum {
	public static int smallSubSum(int arr[],int n,int x) {
		int low = 0,high = 0,sum = 0;
		int ans = Integer.MAX_VALUE;
		
		while(low <= high && high<n ) {
			if(sum < x) {
				sum+=arr[high];
			}
                  while(sum>x){
                      ans = Math.min(ans,high-low+1);
                      sum-=arr[low++];
                  }
             high++; 
		}
		
		return ans;
	}
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(smallSubSum(arr,n,x));
	}
}
