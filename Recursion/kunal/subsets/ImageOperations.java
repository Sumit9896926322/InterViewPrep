package Recursion.kunal.subsets;

public class ImageOperations {
    public static long getMinOperations(int[] pixel) {
        int n = pixel.length;
        int start = 0;
        int end = n - 1;

        while (start < n && pixel[start] == 0) {
            start++;
        }

        while (end >= 0 && pixel[end] == 0) {
            end--;
        }

        if (start >= n) {
            return 0;
        }

        long operations = 0;

        int peak = pixel[start];
        for (int i = start + 1; i <= end; i++) {
            if (pixel[i] > peak) {
                peak = pixel[i];
            } else if (pixel[i] < peak) {
                operations += peak - pixel[i];
                peak = pixel[i];
            }
        }

        operations += (2 * (end - start));

        if (operations == 0) {
            operations = end - start;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] pixel = {5,3,3,3,3,3};
        System.out.println("Minimum operations: " + getMinOperations(pixel));
    }
}