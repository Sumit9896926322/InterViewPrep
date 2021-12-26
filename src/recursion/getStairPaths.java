package recursion;
import java.util.*;

public class getStairPaths {
    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> temp = new ArrayList<String>();//there is one way to reach nth ladder to nth ladder is not move at all i.e we are adding "" in temp arrayList.
            temp.add("");
            return temp;
        }else if(n<0){
            return new ArrayList<String>();
        }
        ArrayList<String> path1 = getStairPath(n-1);
        ArrayList<String> path2 = getStairPath(n-2);
        ArrayList<String> path3 = getStairPath(n-3);
        ArrayList<String> paths = new ArrayList<String>();

        for(String str1:path1)
            paths.add("1"+str1);
        for(String str2:path2)
            paths.add("2"+str2);
        for(String str3:path3)
            paths.add("3"+str3);

        return paths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getStairPath(n));
    }
}
