package recursion.recursionAV;

import java.util.Scanner;

public class permutationWithSpaces {

	public static void pSpaces(String s,String ans,int i) {
		if(s.length() == 0) {
				System.out.println(ans);
			return;
		}
		pSpaces(s.substring(1),ans+s.charAt(0),i+1);
		if(i!=0)
		pSpaces(s.substring(1),ans+" "+s.charAt(0),i+1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String  q = s.next();
	    pSpaces(q,"",0);
	}
}
