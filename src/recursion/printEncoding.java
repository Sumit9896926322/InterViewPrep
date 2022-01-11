package recursion;

public class printEncoding {
    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    //wrong need to complete
    public static void printEncoding(String str,String res){
        if(str.length() == 0){
            System.out.println(res);
            return;
        }

       for(int i =0;i<str.length();i++){
           if(str.charAt(i) != 0){
               printEncoding(str.substring(1),res+alphabet[Integer.parseInt(str.charAt(0)+"")]);
               int val = Integer.parseInt(str.substring(0,2));
               if(str.length() >= 2 && val <= 26){
                   printEncoding(str.substring(2),res+alphabet[val-1]);
               }
           }
       }
    }
    public static void main(String[] args) {
        printEncoding("123","");
    }
}
