import java.util.ArrayList;
import java.util.List;

public class test {


    public static boolean findOddDivisor(int n) {
        int divisorCount = 0;
        int maxDivisorUpto = (int) Math.sqrt(n);
        for (int i = 1; i <= maxDivisorUpto; i++) {
            if (n % i == 0) {
                divisorCount++;
            }
        }
        return (divisorCount * 2) % 2 != 0;
    }

    public static long oddProducts(int n, int[] arr) {
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = i; j < n; j++) {
                num *= arr[j];
                if (findOddDivisor(num)) {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2};
        int n = 4;
        long ans = oddProducts(n,arr);
        System.out.println(ans);
    }
}