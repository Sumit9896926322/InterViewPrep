package Recursion.kunal.array;

import java.util.ArrayList;
import java.util.Scanner;

public class multipleOcurrence {

    public static ArrayList<Integer> multipleOcurrence(int arr[], int s, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (s == arr.length) {
            return list;
        }
        if (arr[s] == k) {
            list.add(s);
        }
        ArrayList<Integer> ans = multipleOcurrence(arr, s+1, k);
        ans.addAll(list);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();

        ArrayList<Integer> ans = multipleOcurrence(arr, 0,k);
        System.out.println(ans);

    }
}
