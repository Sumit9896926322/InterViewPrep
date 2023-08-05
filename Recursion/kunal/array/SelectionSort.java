package Recursion.kunal.array;

import java.util.Scanner;

public class SelectionSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //i should start from 1
    public static int[] selectionSort(int arr[], int i, int j, int maxIndex) {
        if (i == 1) {
            return arr;
        }
        if (arr[j] > arr[maxIndex]) {
            maxIndex = j;
        }
        if (j == i) {
            swap(arr, i, maxIndex);
            return selectionSort(arr, i - 1, 0, 0);
        }
        return selectionSort(arr, i, j + 1, maxIndex);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        arr = selectionSort(arr, arr.length - 1, 0,0);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
