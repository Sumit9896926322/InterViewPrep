package Recursion.kunal.array;

import java.util.Scanner;

public class checkIfArraySorted {

    public static boolean checkSortedArray(int arr[], int s) {
        if (s == arr.length - 1) {
            return true;
        }
        if (arr[s] < arr[s + 1])
            return checkSortedArray(arr, s + 1);
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }


        boolean ans = checkSortedArray(arr, 0);
        System.out.println(ans);

    }
}
