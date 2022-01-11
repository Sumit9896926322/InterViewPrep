package recursion;
import java.util.*;
import java.io.*;

public class printKeyPadCombination {
    static String keyPad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static String[] printKPC(String str, String asf) {
        if(str.length() == 0){
            return new String[]{""};
        }
        char temp = str.charAt(0);
        String res = str.substring(1,str.length());

        String []ans = printKPC(res,temp+"");
        int itemp = Integer.parseInt(temp+"");
        String []previous = keyPad[itemp].split("");
        String []fans = new String[previous.length*ans.length];
        int count = 0;
        for(int i = 0;i<previous.length;i++){
            for(int j = 0;j<ans.length;j++){
                fans[count++] = previous[i]+ans[j];
            }
        }

        return fans;
    }

    public static ArrayList<String> printKPCA(String str, String asf) {
        if(str.length() == 0){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");
            return temp;
        }
        char temp = str.charAt(0);
        String res = str.substring(1,str.length());

        ArrayList<String> pans = printKPCA(res,temp+"");
        int itemp = Integer.parseInt(temp+"");
        String []previous = keyPad[itemp].split("");
        ArrayList<String> fans= new ArrayList<String>();

        for(int i = 0;i<previous.length;i++){
            for(int j = 0;j<pans.size();j++){
                fans.add(previous[i]+pans.get(j));
            }
        }

        return fans;
    }

    public static void printKPCN(String str, String curr) {
        if(str.length() == 0){
            System.out.println(curr);
        }
        char temp = str.charAt(0);
        String res = str.substring(1,str.length());

        int itemp = Integer.parseInt(temp+"");
        String []previous = keyPad[itemp].split("");

        for(int i = 0;i<previous.length;i++){
            printKPCA(res,temp+previous[i]);
        }

    }
    public static void main(String[] args) throws Exception {
        String []ans = printKPC("78","");
        for(String  a:ans){
            System.out.println(a);
        }
//        System.out.println( printKPCA("789",""));
        printKPCN("789","");
    }

}