package string;

import java.util.*;

public class searchWordIn2DGrid {
    static ArrayList<int[]> fans = new ArrayList<int[]>();
    static int dirs[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public static boolean searchIn2d(String s,char res,int i,int j,int count,char mat[][]){
        if(i<0||j<0||i>=mat.length||j>=mat[0].length ||mat[i][j] != s.charAt(count))
            return false;

        if(count >= s.length()-1)
            return true;

        char temp = mat[i][j];
        mat[i][j] = '#';
        boolean match = false;
        for(int k = 0;k<dirs.length;k++){
            int dir[] = dirs[k];
            match = searchIn2d(s,temp,i+dir[0],j+dir[1],count+1,mat);
            if(match){
                fans.add(new int[]{i,j});
                break;
            }
        }

        mat[i][j] = temp;
        return match;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        fans = new ArrayList<int[]>();

        char mat[][] ={
                {'a','b','a','b'},
                {'a','b','e','b'},
                {'e','b','e','b'},
        };
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == s.charAt(0)){
                    searchIn2d(s,mat[i][j],i,j,0,mat);
                }
            }
        }
        for (int i = 0; i < fans.size(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(fans.get(i)[j]+" ");
            }
            System.out.println();
        }

    }
}
