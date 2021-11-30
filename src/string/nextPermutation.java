package string;

import java.util.ArrayList;
import java.util.Arrays;

public class nextPermutation {
    static  ArrayList<Integer> nextPer(int arr[]){
        int mini = -1;
        int N = arr.length;
        for(int i = N-1;i>=1;i--){
            if(arr[i]>arr[i-1]){
                for(int k = N-1;k>=i-1;k--){
                    if(arr[k]>arr[i-1]){
                        int temp = arr[k];
                        arr[k] = arr[i-1];
                        arr[i-1] = temp;
                        break;
                    }
                }
                System.out.println(i);
                Arrays.sort(arr,i,N);
                break;
            }
        }
        if(mini == -1) Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i:arr) ans.add(i);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        System.out.println(nextPer(arr));
    }
}
