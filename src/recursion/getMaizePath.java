package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMaizePath {
    public static ArrayList<String> getMaizePath(int sr,int sc,int dr,int dc){
        if(sr < 0 || sr>dr || sc < 0 || sc> dc)
            return  new ArrayList<>();
        else if(sr == dr && sc == dc){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");
            return temp;
        }
        ArrayList<String> pathV = getMaizePath(sr+1,sc,dr,dc);
        ArrayList<String> pathH = getMaizePath(sr,sc+1,dr,dc);
        ArrayList<String> paths = new ArrayList<String>();

        for(String str2:pathH)
            paths.add("H"+str2);

        for(String str1:pathV)
            paths.add("V"+str1);

        return paths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();

        System.out.println(getMaizePath(0,0,dr-1,dc-1));
    }
}
