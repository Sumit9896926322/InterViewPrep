package backtracking;

public class NQueen {
    public static boolean canPlace(int board[][],int row,int col){
        //check for upper row
        for(int i = row-1,j = col;i>=0;i--){
            if(board[i][j] == 1){
                return false;
            }
        }
        //check for upper left diagonal
        for(int i = row-1,j = col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        //check for upper right diagonal
        for(int i = row-1,j = col+1;i>=0&&j< board.length;i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
    }
    public static void nqueen(int board[][],int row){
        if(row>= board.length){
            printBoard(board);
        }
        for(int j  = 0;j< board.length;j++){
            if(canPlace(board,row,j)){
                board[row][j] = 1;
                nqueen(board,row+1);
                board[row][j] = 0;
            }
        }
    }
    public static void printBoard(int board[][]){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j] == 1? i+"-"+j+",":"");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][]board = new int[4][4];
        nqueen(board,0);

    }
}
