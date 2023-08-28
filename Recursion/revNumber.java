package Recursion;

import java.util.Scanner;

public class revNumber {

    public static int revNum(int n, int k) {
        if (n == 0) {
            return k;
        }
        k = k * 10 + (n % 10);
        return revNum(n / 10, k);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = revNum(n , 0);
        System.out.println(ans);

    }
}
