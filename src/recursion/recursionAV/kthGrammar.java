package recursion.recursionAV;

public class kthGrammar {
    public static int kthGrammar(int n, int k) {
    
        if(n == 1)
            return 0;
        int mid = (int)Math.pow(2,n-1)/2;
    	System.out.println(n+" "+k+" "+mid);
        if(k<=mid){
            return kthGrammar(n-1,k);
        }else{
            if(kthGrammar(n-1,k-mid) == 0)
                return 1;
            else
                return 0;
        }
    }
	
	public static void main(String[] args) {
	    System.out.println(kthGrammar(3,3));
	}
}
