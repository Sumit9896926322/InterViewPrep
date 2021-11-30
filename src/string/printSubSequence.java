package string;

import java.util.ArrayList;

public class printSubSequence {
    public static void printSub(ArrayList<String> ans,String []arr,int i) {
        if(i >= arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printSub(ans,arr,i+1);
        ans.remove(arr[i]);
        printSub(ans,arr,i+1);
    }

    public static void printSumDivisibleByK(ArrayList<String> ans,int sum,String []arr,int i,int k) {
        if(i >= arr.length){
            if(sum%k == 0)
                System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printSumDivisibleByK(ans,sum+Integer.parseInt(arr[i]),arr,i+1,k);
        ans.remove(arr[i]);
        printSumDivisibleByK(ans,sum,arr,i+1,k);
    }

    public static int countPairsSumDivisibleByK(ArrayList<String> ans,int sum,String []arr,int i,int k) {
        if(i >= arr.length){
            if(sum%k == 0)
                return 1;
            else
                return 0;
        }
        ans.add(arr[i]);
        int l = countPairsSumDivisibleByK(ans,sum+Integer.parseInt(arr[i]),arr,i+1,k);
        ans.remove(arr[i]);
        int r = countPairsSumDivisibleByK(ans,sum,arr,i+1,k);
        return l+r;
    }

    public static void main(String[] args) {
        String arr[] = {"1","2","3"};
       // printSumDivisibleByK(new ArrayList<String>(),0,arr,0,3);
        System.out.println(countPairsSumDivisibleByK(new ArrayList<String>(),0,arr,0,3));
    }
}
