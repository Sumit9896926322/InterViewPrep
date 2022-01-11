package recursion;

import java.util.Scanner;

public class targetSumSubset {
    public static void targetSum(int[]arr,int k,int index,int sum,String ans){
        if(index>=arr.length){
            if(k == sum){
                System.out.println(ans+" .");
            }
            return;
        }
            targetSum(arr,k,index+1,sum+arr[index],ans+arr[index]+",");
            targetSum(arr,k,index+1,sum,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        targetSum(arr,k,0,0,"");
    }
}
