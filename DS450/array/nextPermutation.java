package array;
import java.util.*;
public class nextPermutation {
	
public static int [] reverse(int arr[],int i, int j) {
	while(i<j) {
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j] = temp;
	}
	return arr;
}
public static void main(String[] args) {

	int arr[]= {1,2,3,6,5,4};
	int n = arr.length;
	
	for(int i = n-1;i>=1;i--) {
		System.out.println(i);
		if(arr[i]>arr[i-1]) {
			for(int k = n-1;k>=i;k--) {
				if(arr[k]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
					break;
				}
			}
			arr = reverse(arr,i+1,n-1);
			break;
		}else {
			if(i == 1)
				arr = reverse(arr,0,n-1);
				
		}
	}
	
	for(int i:arr) System.out.println(i);
		
}
}
