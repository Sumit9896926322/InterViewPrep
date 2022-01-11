package recursion;
import java.util.ArrayList;

public class getSubsequences {
    public static ArrayList<String> getSubsequence(String str){
        if(str.length() == 0){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("");
            return temp;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1,str.length());
        ArrayList<String> hans= getSubsequence(rest);
        ArrayList<String> fans= new ArrayList<>(hans);

        for(int i = 0;i<hans.size();i++)
            fans.add(ch+hans.get(i));

        return fans;
    }

 
    public static void main(String[] args) {
        System.out.println(getSubsequence("abc"));

    }
}
