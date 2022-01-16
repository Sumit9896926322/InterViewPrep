package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class productStep {
    public static ArrayList<String> productStep(int arr[],int k,int n,ArrayList<String> ans,int product,String pans){
        if(product > k)
            return ans;
        else if(product == k){
            if(ans.size() == 0){
                ans.add(pans);
            }else if(ans.get(0).length() == pans.length()){
                String smallerStr = ans.get(0).compareTo(pans) < 0?ans.get(0):pans;
                ans.set(0,smallerStr);
            }else if(ans.get(0).length() > pans.length()){
                ans.set(0,pans);
            }
           return ans;
        }else{
            for(int i = 0;i<arr.length;i++){
                if(arr[i]>1)
                 productStep(arr,k,n,ans,product*arr[i],pans+arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int  n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            ArrayList<String> ans = productStep(arr,k,n,new ArrayList<String>(),1,"1");
            if(ans.size() == 0){
                System.out.println(-1);
            }else{
                for(char ch:ans.get(0).toCharArray()){
                    System.out.print(ch+" ");
                }
            }
    }
}
