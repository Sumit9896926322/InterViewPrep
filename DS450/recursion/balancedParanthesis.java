package recursion;

import java.util.Scanner;

public class balancedParanthesis {
	private static void balancedPar(String par,int left,int right,int n) {
		if(left == n && right == n) {
			System.out.println(par);
			return;
		}
		if(left<=n) {
			balancedPar(par+"(",left+1,right,n);
		}
		if(right< left && right<=n) {
			balancedPar(par+")",left,right+1,n);
		}
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0) {
	    	int n = s.nextInt();
	    	balancedPar("",0,0,n);
	    }
	}
}
