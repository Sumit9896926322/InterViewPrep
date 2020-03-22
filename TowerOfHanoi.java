package DS_ALGO;
import java.util.*;
import java.io.*;

public class TowerOfHanoi {

	public static void solveTOH(char a,char b,char c,int n) {
		if(n == 1) {
				System.out.println(n+" : "+a+" => "+c);		
			return;
		}
		//Moving n-1 rings from source to helper
		solveTOH(a,c,b,n-1);
		
			System.out.println(n+" : "+a+" => "+c);
		
		//Moving nth ring from source to destination
		solveTOH(b,a,c,n-1);
	}
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
	   
		int T= Integer.parseInt(bf.readLine());
		while(T-- > 0) {
		int n = Integer.parseInt(bf.readLine());
		solveTOH('A','B','C',n);
		}
	}

}
