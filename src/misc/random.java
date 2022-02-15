package misc;

public class random {
//    public static boolean pallinDrome(String str){
//        for(int i= 0;i<str.length()/2;i++){
//            if(str.charAt(i) != str.charAt(str.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isAnagram(String str1,String str2){
//        if(str1.length() != str2.length())
//            return false;
//
//        int aux[] = new int[256];
//        for(char a:str1.toCharArray()){
//            aux[a]++;
//        }
//        for(char b:str2.toCharArray()){
//            aux[b]--;
//        }
//        for(int a :aux){
//            if(a != 0){
//                return false;
//            }
//        }
//        return true;
//    }
    //3 2
    // 1,2,3,1-[1-2,1-2-3,]
    //1-[[1-2],[1,3],[1,4],2=[2-3][2-4],[3-4]]

    // 4 3
     //
//    public static int flavours(int n,int k) {
//        int ans = n;
//        for(int i = 1;i<=n;i++){
//            int max = Math.min(i+k,n);
//            for(int j = i+1;j<=max;j++){
//                    ans++;
//            }
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "acb";
//        System.out.println( flavours(4,3));
    }
}
