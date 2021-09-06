package array;

import java.util.Scanner;

public class moveNegativesToLeft {
	public static int[] swap(int i,int j,int arr[]) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void moveNegatives(int arr[],int n) {
		int low = 0,high = n-1;
		while(low<=high) {
			if(arr[low]<0)
				low++;
			else {
				arr = swap(low,high,arr);
				high--;
			}
		}
		
		for(int i:arr)
			System.out.println(i);
	}
	public static void main(String[] args) {
	
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) 
			arr[i] = s.nextInt();
		moveNegatives(arr,n);
	
		
	}
}
