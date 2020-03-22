package DS_ALGO;
import java.util.*;

public class string {
	static String ans="";
	static String arr[] = new String[10];
    public static String countAndSay(int n) {
        
    	if(arr[n-1]!= null) {
     	   System.out.println("here"+arr[n-1]);
     		return arr[n-1];
     	}
    	if(n == 1) {
        	ans="1";
        	arr[n-1]=ans;
        	System.out.println("stored by 1"+arr[n-1]);
            return arr[n-1];
        }
        
        countAndSay(n-1);
   
  		  String res ="";
  		  int repeat=1;
  		  
  		  for(int i = 0;i<ans.length()-1;i++){
                if(ans.charAt(i) == ans.charAt(i+1))
                    repeat+=1;
               else{
                    res+=repeat+""+ans.charAt(i);
                    repeat = 1;
               }
            }
  		  res+=repeat+""+ans.charAt(ans.length()-1);
  		  ans = res;
       
  		arr[n-1]=ans;
  		System.out.println("stored"+arr[n-1]);
        return res;
    }
    public static void main(String []args) {
    	for(int i = 1;i<5;i++)
    	System.out.println(countAndSay(i)+" "+i);
    	for(int i = 1;i<5;i++) {
    		System.out.println(countAndSay(i)+" "+i);
    	}

    }
}