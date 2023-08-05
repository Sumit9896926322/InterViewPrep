package Recursion.kunal.array;

import java.util.Scanner;

public class BubbleSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //i should start from 1
    public static int[] bubbleSort(int arr[], int i, int j) {
        if (i == arr.length - 1) {
            return arr;
        }
        if (arr[j] > arr[j + 1]) {
            swap(arr, j, j+1);
        }
        if (j == arr.length - 1 - i) {
            return bubbleSort(arr, i + 1, 0);
        }
        return bubbleSort(arr, i, j + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        arr = bubbleSort(arr, 1, 0);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
