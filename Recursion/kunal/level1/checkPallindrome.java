package Recursion.kunal.level1;

import java.util.Scanner;

public class checkPallindrome {

    public static boolean checkPallindrome(String str, int s) {
        int n = str.length();
        if (s > n / 2 - 1) {
            return true;
        }
        //we can also make this variable as static
        return str.charAt(s) == str.charAt((n-1) - s) && checkPallindrome(str, s + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();


        boolean ans = checkPallindrome(str, 0);
        System.out.println(ans);

    }
}
