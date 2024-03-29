package backtracking;

import java.io.*;
import java.util.*;


public class nqueen {

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
        for (int j : arr) System.out.println(j);
    }

    public static void printMat(int board[][], int n) {
        for (int[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }

    public static boolean canPlace(int board[][], int r, int c) {
        //check upwards
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 1)
                return false;
        }
        //check left diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        //check right diagonal
        for (int i = r, j = c; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1)
                return false;

        }
        return true;
    }

    public static void solveNQueen(int board[][], int r) {
        if (r == board.length) {
            printMat(board, board.length);
            return;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (canPlace(board, r, i)) {
                board[r][i] = 1;
                solveNQueen(board, r + 1);
                board[r][i] = 0;
            }
        }

    }

    static int board[][];
    static ArrayList<String> ans;

    public static void main(String[] args) throws IOException {

        int T = 1;
        T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            board = new int[n][n];
            ans = new ArrayList<String>();
            solveNQueen(board, 0);
        }
    }

}
