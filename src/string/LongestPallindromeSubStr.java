package string;
import java.io.*;

public class LongestPallindromeSubStr {
    static int ans = Integer.MIN_VALUE;
    static String ansString = "";


    public static int LPS(String s,int low,int high) {

       while(high<s.length()){
           int start = low,end = high;

           while(start>=0&&end<s.length()&&s.charAt(start) == s.charAt(end)){
               int pallinLength = end+1-start;
               if(pallinLength>ans){
                   ans = pallinLength;
                   ansString = s.substring(start,end+1);
               }
               start--;
               end++;
           }

           low++;
           high++;
       }
        return ans;
    }


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int evenCase  = LPS(s,0,0);
        String evenString = ansString;
        int oddCase = LPS(s,0,1);

        System.out.println(evenCase>oddCase?evenString:ansString);

    }
}
