package string;

public class maxStringWithZeroOnes {
    public static void main(String[] args) {
        String a = "0100110101";
        int i = 0;
        int zeroCount = 0,oneCount = 0,ans = -1;
        while(i<a.length()){
            if(a.charAt(i) == '0')
                zeroCount++;
            else
                oneCount++;

            if(zeroCount==oneCount)
                ans = Math.max(zeroCount,ans);
            i++;
        }
        System.out.println(ans);
        System.out.println("Hello world");
    }
}
