package array;

import java.util.Scanner;

public class minJumps {
	static int ans = Integer.MAX_VALUE;
	public static int minJumps(int index,int step,int arr[]) {

        if(arr[index] == 0)
        	return -1;
        
		if(index >= arr.length-1)
        	return 1;
	
		for(int i = index+1;i<=Math.min(index+step,arr.length-1);i++) {
		
			int jumps = minJumps(i,arr[i],arr);
			if(jumps == -1)
				return -1;
			
			ans = Math.min(ans, 1 + minJumps(i,arr[i],arr));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int n = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
		
			minJumps(0,arr[0],arr);
			System.out.println(ans);
		
		}
	}
}
