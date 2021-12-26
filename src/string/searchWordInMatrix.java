package string;

import java.util.Scanner;

public class searchWordInMatrix {
    public static int searchIn2d(String s,String res,int i,int j,int count,String mat[][]){
        System.out.println(res+" "+i+" "+j+" "+count);
        if(i<0||j<0||i>=mat.length||j>=mat[0].length)
            return 0;
        if(!mat[i][j].equals(s.charAt(count)+""))
            return 0;
        if(count >= s.length())
            return 1;

        String temp = mat[i][j];
        mat[i][j] = "#";

        searchIn2d(s,temp,i,j+1,count+1,mat);
        searchIn2d(s,temp,i+1,j,count+1,mat);
        searchIn2d(s,temp,i,j-1,count+1,mat);
        searchIn2d(s,temp,i-1,j,count+1,mat);

        mat[i][j] = temp;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String mat[][] ={
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","a"},
        };
        int m = mat.length;
        int n = mat[0].length;

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j].equals(s.charAt(0)+"")){
                    ans+=searchIn2d(s,mat[i][j],i,j,1,mat);
                }
            }
        }
        System.out.println(ans);
    }
}
