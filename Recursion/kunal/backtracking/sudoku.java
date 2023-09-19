package Recursion.kunal.backtracking;

import java.io.IOException;

public class sudoku {
    public static void printMat(int mat[][]) {
        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean canPlace(int board[][], int row, int col, int elem) {
        //checking if number present in whole row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == elem)
                return false;
        }

        //checking if number present in whole col
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == elem)
                return false;
        }

        //checking in small boxes
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - (row % sqrt);
        int startCol = col - (col % sqrt);

        for (int j = startRow; j < startRow + sqrt; j++) {
            for (int k = startCol; k < startCol + sqrt; k++) {
                if (board[j][k] == elem) {
                    return false;
                }
            }
        }



        return true;
    }

    public static void solve(int board[][], int row, int col) {
        if (row == board.length) {
            printMat(board);
            return;
        }

        int nrow = row;
        int ncol = col;
        if (col == board[0].length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            ncol = col + 1;
        }

        if (board[row][col] == 0) {
            for (int num = 1; num <= 9; num++) {
                if (canPlace(board, row, col, num)) {
                    board[row][col] = num;
                    solve(board, nrow, ncol);
                    board[row][col] = 0;
                }
            }
        } else {
            solve(board, nrow, ncol);
        }
    }

    public static void main(String[] args) throws IOException {

        int board[][] = {
                {0, 0, 5, 0, 0, 0, 0, 0, 0},
                {9, 2, 1, 0, 0, 0, 0, 0, 0},
                {6, 4, 7, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 3, 0, 0, 0},
                {0, 0, 0, 7, 8, 4, 0, 0, 0},
                {0, 0, 0, 6, 9, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 8, 7, 3},
                {0, 0, 0, 0, 0, 0, 9, 6, 2},
                {0, 0, 0, 0, 0, 0, 1, 4, 5}
        };

        solve(board, 0, 0);

    }

}
