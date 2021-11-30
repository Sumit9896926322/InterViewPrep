package string;

import java.util.Scanner;

public class reverseWordInAString {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void reverseWordsNaive(String str){
        String ans = "";
        String lans = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                lans = reverse(lans);
                ans+=lans+" ";
                lans = "";
            }else{
                lans+=str.charAt(i);
            }
        }
        ans+= reverse(lans);
        System.out.println(reverse(ans));
    }

    public static void reverseWordsOptimise(String str){
        //Without auxillary space

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        reverseWordsNaive(str);

    }
}
