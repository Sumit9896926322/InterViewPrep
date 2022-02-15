package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class minSteps {
    static HashMap<Integer,ArrayList<String>> dp = new HashMap<Integer,ArrayList<String>>();
    public static ArrayList<String> calculateSteps(int n,String ans) {
        if(n<0){
            return new ArrayList<String>();
        }
        if(n == 0){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");
            return temp;
        }
        if(dp.containsKey(n)){
            System.out.println("dp called");
            return dp.get(n);
        }
        ArrayList<String> onePath = calculateSteps(n-1,ans+"1");
        ArrayList<String> twoPath = calculateSteps(n-2,ans+"1");
        ArrayList<String> finalPath = new ArrayList<String>();

        for(String a:onePath){
            finalPath.add("1"+a);
        }
        for(String b:twoPath){
            finalPath.add("2"+b);
        }

        if(!dp.containsKey(n))
            dp.put(n,finalPath);

        return finalPath;
    }
    public static void main(String[] args) {
        int n = 4;
        int squareN = n*n;
        calculateSteps(n,"");
        System.out.println(dp);
    }
}
