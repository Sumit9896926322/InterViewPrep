package Recursion.kunal.array;

import java.util.Arrays;
import java.util.Scanner;

//TODO:Update this with return type array
public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] arr1 = Arrays.copyOfRange(arr, low, mid + 1);
        int[] arr2 = Arrays.copyOfRange(arr, mid + 1, high + 1);

        int i = low, j = mid + 1, k = low;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                arr[k++] = arr1[i++];
            else if (arr1[i] > arr2[j])
                arr[k++] = arr2[j++];
            else
                arr[k++] = arr1[i++]; // since both i and j are equal we can also write arr[k++] = arr2[j++]
        }

        while (i < arr1.length)
            arr[k++] = arr1[i++];

        while (j < arr2.length)
            arr[k++] = arr2[j++];

    }



    public static int[] mergeInPlace(int[] arr, int low, int mid, int high) {
        //not checked yet
        int arr2[] = new int[high - low];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j < arr.length) {
            if (arr[i] < arr[j])
                arr2[k++] = arr[i++];
            else if (arr[i] > arr[j])
                arr2[k++] = arr[j++];
            else
                arr2[k++] = arr[i++];
        }

        while (i <= mid)
            arr2[k++] = arr[i++];

        while (j < arr.length)
            arr2[k++] = arr[j++];

        return arr2;
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
