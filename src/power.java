public class power {
    public static int recursivePower(int num,int power) {
        if(power == 0){
            return 1;
        }
        if(power%2 == 0){
            return recursivePower(num*num,power/2);
        }else{
            return num * recursivePower(num,power-1);
        }
    }
    public static void main(String[] args) {
        int num = 2;
        int power = 3;
        int ans = 1;
        //2 4
        //
        // 2^3 = n * rec(n-1)
        //2^4 = rec(n^2,pow/2)

        for(int i = 1;i<=power;i++){
            ans = ans * num;
        }
        System.out.println(ans);
    }

}
