package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMaizePath {
    public static ArrayList<String> getMaizePath(int sr,int sc,int dr,int dc){
        if(sr < 0 || sr>dr || sc < 0 || sc> dc)
            return  new ArrayList<>();
        else if(sr == dr && sc == dc){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");//there is one way to reach (dr,dc) to (dr,dc) is not move at all i.e we are adding "" in temp arrayList.
            return temp;
            
        }
        ArrayList<String> pathV = getMaizePath(sr+1,sc,dr,dc);
        ArrayList<String> pathH = getMaizePath(sr,sc+1,dr,dc);
        ArrayList<String> paths = new ArrayList<String>();

        for(String str2:pathH)
            paths.add("H"+str2);//we can add "H" to all the path reachable to destination from grid(H+1,C);

        for(String str1:pathV)
            paths.add("V"+str1);//we can add "V" to all the path reachable to destination from grid(H,C+1);

        return paths;
    }

    public static ArrayList<String> getMaizePathJump(int sr,int sc,int dr,int dc){
        if(sr < 0 || sr>dr || sc < 0 || sc> dc)
            return  new ArrayList<>();
        else if(sr == dr && sc == dc){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");//there is one way to reach (dr,dc) to (dr,dc) is not move at all i.e we are adding "" in temp arrayList.
            return temp;
        }

        ArrayList<String> paths = new ArrayList<String>();
        for(int hm = 1;hm<=dc-sc;hm++){
            ArrayList<String> pathH = getMaizePathJump(sr,sc+hm,dr,dc);
            for(String str2:pathH)
                paths.add("h"+hm+str2);
        }

        for(int vm = 1;vm<=dr-sr;vm++){
            ArrayList<String> pathV = getMaizePathJump(sr+vm,sc,dr,dc);
            for(String str2:pathV)
                paths.add("v"+vm+str2);
        }

        for(int dm = 1;dm<=dr-sr && dm<=dc-sc;dm++){
            ArrayList<String> pathD = getMaizePathJump(sr+dm,sc+dm,dr,dc);
            for(String str3:pathD)
                paths.add("d"+dm+str3);
        }
        return paths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();

        System.out.println(getMaizePathJump(0,0,dr-1,dc-1));
    }
}