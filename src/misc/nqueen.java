package misc;

public class nqueen {
    public static boolean canPlace(int board[][],int i,int j,int k,int l) {
        boolean isSafe = true;
        if(board[k][j] == 1)
            isSafe = false;
        if(i == k || j == l){
            isSafe = false;
        }else if(i+j == k+l || i-j == k-l)
            isSafe = false;

        return isSafe;
    }
    public static void nqueen(int board[][],int i,int j,int k,int l) {
        if(k>= board.length){
            for(int a = 0;a< board.length;a++){
                for(int b =0;b<board.length;b++){
                    System.out.println(board[a][b]);
                }
            }
            return;
        }
        if(k >=board.length ||l>= board.length){
            return;
        }
        if(canPlace(board,i,j,k,l)){
            board[k][l] = 1;
            nqueen(board,i,j,k+1,l);
            board[k][l] = 0;
        }
        nqueen(board,i,j,k,l+1);
    }
    public static void main(String[] args) {
        int board[][] = new int[4][4];
        nqueen(board,0,0,0,0);
    }
}
