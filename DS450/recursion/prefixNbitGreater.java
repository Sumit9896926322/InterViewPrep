package recursion;

import java.util.Scanner;

public class prefixNbitGreater {
	private static void prefixNbitGreater(String par,int zcount,int ocount,int n) {
		if(par.length() == n) {
			System.out.println(par);
			return;
		}
		
		prefixNbitGreater(par+"1",zcount,ocount+1,n);
	
		if(zcount < ocount) {
			prefixNbitGreater(par+"0",zcount+1,ocount,n);
		}
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0) {
	    	int n = s.nextInt();
	    	prefixNbitGreater("",0,0,n);
	    }
	}
}
