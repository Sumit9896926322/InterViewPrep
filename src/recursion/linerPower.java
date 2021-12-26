package recursion;

public class linerPower {
    public static int calculatePower(int n,int x){
        if(x == 1)
            return n;

        if(x%2 == 0){
            return calculatePower(n*n,x/2);
        }else{
            return n* calculatePower(n,x-1);
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int x = 10;
        int ans = calculatePower(n,x);
        System.out.println(ans);
    }
}
