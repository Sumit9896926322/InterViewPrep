package Recursion;

import java.io.*;
import java.util.*;

public class Subsets {

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

    public static void iterativeSubsets(String s) {
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        ArrayList<String> initial = new ArrayList<String>();
        initial.add("");

        ans.add(initial);

        for (int i = 0; i < s.length(); i++) {
            ArrayList<ArrayList<String>> temp = ans;
            int n = temp.size();

            for (int j = 0; j < n ;j++) {
                ArrayList<String> include = new ArrayList<String>();
                include.add(temp.get(j).get(0) + s.charAt(i));
                ans.add(include);
            }
        }
        System.out.println(ans.toString());

    }

    public static void subsets(String s, String curr) {

        if (s.length() == 0) {
            System.out.println(curr);
            return;
        }

        subsets(s.substring(1), curr);
        subsets(s.substring(1), curr + s.charAt(0));
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        iterativeSubsets("abc");
    }

}
