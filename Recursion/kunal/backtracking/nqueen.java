package Recursion.kunal.backtracking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nqueen {
    public static void printMat(int board[][], int n) {
        for (int[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }

    public static boolean canPlace(int board[][], int r, int c) {
        //check downwards
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

    static ArrayList<String> ans;

    public static void main(String[] args) throws IOException {

        int T = 1;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int board[][] = new int[n][n];
            ans = new ArrayList<String>();
            solveNQueen(board, 0);
        }
    }

}
