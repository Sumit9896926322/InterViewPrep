package recursion.recursionAV;

import java.util.Scanner;

public class printSubsets {
	public static void printSubsets(String s,String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
	   printSubsets(s.substring(1, s.length()),ans);
	   printSubsets(s.substring(1, s.length()),ans+ s.charAt(0));
	   
	   //permutation with case change
	   //printSubsets(s.substring(1, s.length()),ans+s.charAt(0));
       //if(!Character.isLowerCase(s.charAt(0)))
	   // printSubsets(s.substring(1, s.length()),ans+  Character.toUpperCase(s.charAt(0)));
	}
	public static void main(String[] args) {
		int t = 1;
		Scanner s = new Scanner(System.in);
	    t = s.nextInt();
		while(t-- > 0) {
	 

	    String u = s.next();
		printSubsets(u,"");
		}
	}
}
