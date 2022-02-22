package backtracking;

import java.util.Scanner;

public class sudokuSolver {
    public static boolean canPlace(int grid[][],int k,int l,int num){
        int n = grid.length;
        for(int i = 0;i<grid.length;i++) {
            //found value in same column diff row
            if (grid[k][i] == num)
                return false;

            //found value in same row diff column
            if (grid[i][l] == num)
                return false;
        }
        //k-(k%n) staring point of sub-matrix
        //l-(l%n) staring point of sub-matrix
        int si = k-(k% (int)Math.sqrt(n));
        int sj = l-(l% (int)Math.sqrt(n));
        for(int i =  0;i<Math.sqrt(n);i++){
            for(int j = 0;j<Math.sqrt(n);j++){
                if(grid[si+i][sj+j] == num){
                    //found value in same column diff row
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(int board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solve(int grid[][],int k,int l){
        if(k == grid.length-1 && l == grid.length){
            printBoard(grid);
            return;
        }
        if(l== grid.length) {
            k++;
            l = 0;
        }

        if(grid[k][l] == 0){
            for(int num = 1;num<=9;num++){
                if(canPlace(grid,k,l,num)){
                    grid[k][l] = num;
                    solve(grid,k,l+1);
                    grid[k][l] = 0;
                }
            }
        }else{
            solve(grid,k,l+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        solve(grid,0,0);

    }
}
