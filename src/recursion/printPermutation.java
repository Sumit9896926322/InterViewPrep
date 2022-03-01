package recursion;

import java.util.*;

public class printPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[n];
        int ans = 0;
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int half = (arr.length - 1)/2;
        System.out.println(arr[half]+arr[half+1]);
    }

}
