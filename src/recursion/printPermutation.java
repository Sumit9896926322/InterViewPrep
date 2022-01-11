package recursion;

import java.util.Scanner;

public class printPermutation {
    public static void printPermutation(String str,String curr){
        if(str.length() == 0){
            System.out.println(curr);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            String res = str.substring(0,i)+str.substring(i+1,str.length());
            printPermutation(res,curr+temp);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str,"");
    }

}
