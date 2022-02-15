package recursion.recursionAV;
import java.util.*;

public class sortArray {
   
	static int[] arr;
	
	public static void sortRecursive(int arr[],int n) {
		
		if(n == 0)
			return;
		sortRecursive(arr,n-1);
		
		int temp = arr[n];
		int i = n-1;
		while(i>=0 && arr[i]>temp){
			arr[i+1] = arr[i];
			i--;
		}
		arr[i+1] = temp;
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int t = 1;
		t = s.nextInt();
		
		while(t-- > 0) {
			int n = s.nextInt();
			int arr[] = new int[n];
			
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
			sortRecursive(arr,n-1);
			
			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();
		}
  }
}
