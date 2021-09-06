package array;
import java.util.*;
public class commonIn3Array {

   public static void main(String[] args) {
	   int i = 0,j = 0,k =0;
	      ArrayList<Integer> ans = new ArrayList<Integer>();
	     
	      
	       int A[] =  {1,1,1};
	       int B[] = {1,1,1};
	       int C[] = {1,1,1};
	       int n1 =A.length;
	       int n2 =B.length;
	       int n3 = C.length;
	       while(i<n1 && j<n2 && k<n3){
	        if(A[i] <B[j]) i++;
	        else  if(B[j]>A[i]) j++;
	        else{
	         while(C[k]<=A[i] && k<n3-1) k++;
	         if(C[k] == A[i]) {
	        	 ans.add(C[k]);
	         }
	         i++;
	         k++;
	        }
	   
	       }
	       System.out.println(ans);
	   
	}
}
