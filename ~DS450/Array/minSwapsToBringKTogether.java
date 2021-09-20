package array;
import java.util.*;
public class minSwapsToBringKTogether {
	
	 public static int minSwap (int arr[], int n, int k) {
	       int count = 0;
	       
	       for (int i = 0; i < arr.length; i++) 
			if(arr[i]<=k) count++;
	       
	       int ans = 0;
	       int low =0,high = count;
	       
	       for (int i = low; i < high; i++) {
	    	   if(arr[i]>k) ans++;
	       }
	       int fans = ans;
	   
	       while(high<n) {
	    	  
	    	   //greater element going outside
	    	   if(arr[low]>k ) ans--;
	    	   
	    	   //smaller element coming inside
	    	   if(arr[high]>k) ans++;
	    	   
	    	   fans = Math.min(ans, fans);
	 
	    	   low++;
	    	   high++;
	       }
	       
	       
	       return fans;
	  }
	 public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int arr[]= new int[n];
		 for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		 }
		 int k = s.nextInt();
		 int fans = minSwap(arr,n,k);
		 
		 System.out.println(fans);
	 }
}
