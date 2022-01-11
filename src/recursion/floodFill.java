package recursion;

import java.util.Scanner;

public class floodFill {
    public static void findPath(int mat[][],int i,int j,int m,int n,String ans){
        if(i<0 || j<0||i>=m||j>=n||mat[i][j] == 1)
            return;
        if(i == m-1 && j== n-1)
            System.out.println(ans);

        mat[i][j] = 1;

        findPath(mat,i-1,j,m,n,ans+"t");
        findPath(mat,i,j-1,m,n,ans+"l");
        findPath(mat,i+1,j,m,n,ans+"d");
        findPath(mat,i,j+1,m,n,ans+"r");

        mat[i][j] = 0;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String []arr = str.split(" ");
        System.out.println(arr.length);
      int m = Integer.parseInt(arr[0]);
      int n = Integer.parseInt(arr[1]);
      int mat[][] = new int[m][n];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        findPath(mat,0,0,m,n,"");
    }
}
