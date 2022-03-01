package backtracking;
import java.io.*;
import java.util.*;

public class pallindromePartition {
    public static boolean isPallinDrome(String str){
        for(int i =0 ;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void solution(String str,int i,int ci,ArrayList<ArrayList<String>> arr,boolean addNew) {
        //write you code here
        if(i == str.length()){
//            System.out.println(arr);
            for(ArrayList<String> x:arr){
                for(String y:x){
                    if(!isPallinDrome(y)){
                        return;
                    }
                }
            }
            for(ArrayList<String> x:arr){
                System.out.print("("+ x.get(0) +") ");
            }
            System.out.println();
            return;
        }

            ArrayList<String> exc = new ArrayList<String>();
            exc.add(str.charAt(i)+"");
            arr.add(exc);
            solution(str,i+1,ci+1,arr,true);
            arr.remove(ci);

        if(arr.size()>0) {
            ArrayList<String> inc = arr.get(arr.size() - 1);
            String prev = inc.get(0);
            String res = inc.get(0) + str.charAt(i);
            arr.get(ci - 1).set(0, res);
            solution(str, i + 1, ci, arr, false);
            arr.get(ci - 1).set(0, prev);
        }


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();

        // for(int i = 0;i<str.length();i++){
        // 	arr.add(new ArrayList<String>());
        // }

        solution(str,0,0,arr,true);
    }

}