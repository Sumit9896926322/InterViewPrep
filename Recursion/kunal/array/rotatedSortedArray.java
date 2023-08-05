package Recursion.kunal.array;

import java.util.Scanner;

public class rotatedSortedArray {

    public static int search(int arr[], int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low+high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] >= arr[low]) {
            if (target >= arr[low] && target <= arr[mid]) {
                return search(arr, target, low, mid - 1);
            } else {
                return search(arr, target, mid + 1, high);
            }
        } else {
            if (target >= arr[mid] && target <= arr[high]) {
                return search(arr, target, mid + 1, high);
            } else {
                return search(arr, target, low, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int targetIndex = search(arr, 5, 0, arr.length - 1);
        System.out.println(targetIndex);

    }
}
