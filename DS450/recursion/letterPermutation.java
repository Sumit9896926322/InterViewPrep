package recursion;
import java.util.*;

public class letterPermutation {
    static ArrayList<String> arr;
    public static  List<String> letterCasePermutation(String s) {
        arr = new ArrayList<String>();
        printSubsets(s,"");
        return arr;
    }
    
    public static void printSubsets(String s,String ans) {
		if(s.length() == 0) {
			arr.add(ans);
			return;
		}
	   
       if(Character.isDigit(s.charAt(0)))
           printSubsets(s.substring(1, s.length()),ans+s.charAt(0));
        else{
                printSubsets(s.substring(1, s.length()),ans+Character.toLowerCase(s.charAt(0)));
                printSubsets(s.substring(1, s.length()),ans+Character.toUpperCase(s.charAt(0)));
        }
	
	}
    
   public static void main(String[] args) {
	   List<String> ans= letterCasePermutation("a1B2");
	   System.out.println(ans);
   }
}