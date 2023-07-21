package oops;

public class main {
    public static void main(String[] args) {
        int m = 3;
        for(int row=0; row<m; row++){
            for(int col=0; col<row+1; col++)
                System.out.println("*");
            System.out.println();
        }
    }
}
