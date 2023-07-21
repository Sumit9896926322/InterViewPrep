package Recursion;

import java.util.Scanner;

public class revNumber {

    public static int revNum(int n, int k) {
        if (n == 0) {
            return 0;
        }
        return k * 10 + (n % 10) + revNum(n / 10, n % 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = revNum(n / 10, n % 10);
        System.out.println(ans);
    }
}
