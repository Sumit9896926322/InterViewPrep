package Recursion.kunal.array;

import java.util.Arrays;
import java.util.Scanner;

//TODO:Update this with return type array
public class QuickSort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low, j = high, pivot = arr[high];
        while (i < j) {
            while (i <= arr.length - 1 && arr[i] < pivot) i++;
            while (j >= 0 && arr[j] >= pivot) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, i, high);
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            quickSort(arr, 0, arr.length - 1);

            for (int i : arr) {
                System.out.println(i);
            }
        }
    }

}
