package string;

public class permutation {
    public static String swap(String s,int i,int j){
        char arr[] = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return new String(arr);
    }
//    public static void permute(String s,String curr,int j){
//        if(i == s.length()||j == s.length())
//            return;
//
//
//        System.out.println(swap(s,i,j));
//        permute(s,i,j+1);
//        permute(s,i+1,j);
//    }
    public static void main(String[] args) {
        String s = "ABC";
//        permute(s,0,0);
    }
}
