package Recursion;

import java.io.*;
import java.util.*;

public class permutation {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int nextInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static long nextLong() throws IOException {
        return Long.parseLong(br.readLine());
    }

    public static String next() throws IOException {
        return br.readLine();
    }

    public static int[] nextArr() throws IOException {
        String elements[] = br.readLine().split(" ");
        int arr[] = new int[elements.length];
        for (int j = 0; j < elements.length; j++)
            arr[j] = Integer.parseInt(elements[j]);
        return arr;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static String swap(String s, int i, int j) {
        char arr[] = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return new String(arr);
    }

    public static void permutation(String p, String up) {
        if (p.equals("")) {
            System.out.println(up);
            return;
        }
        for (int i = 0; i < p.length(); i++) {
            String left = p.substring(0, i);
            String right = p.substring(i+1);
            permutation(left + right, up + p.charAt(i));
        }

    }

    public static void permutationForLoop(String s, int i) {
        if (i == s.length()) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permutationForLoop(s, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        int T = 1;
        while (T-- > 0) {

            String s = next();
            permutationForLoop("abc", 0);

        }
    }

}
