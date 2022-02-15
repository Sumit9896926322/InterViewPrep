package misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class removeToMakeSorted {
    public static void removeAndSort(int []arr) {
        int []brr = new int[arr.length];
        int count = 1;
        brr[0] = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>brr[count-1]){
                brr[count] = arr[i];
                count++;
            }
        }

        for(int j = 0;j<count;j++){
            System.out.print(brr[j]+" ");
        }
        System.out.println();
    }

    public static String removeDuplicate(String str) {
        char arr[] = str.toCharArray();

        String ans = "";
        int i = 0;
        for(i = 0;i<arr.length;i++){
            while( i<arr.length-1 &&arr[i] == arr[i+1])
                i++;
            if(ans.indexOf(arr[i]) == -1)
                ans+=arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
            int []arr = {1, 2, 4, 3, 5, 7, 8, 6, 9, 10 };
            removeAndSort(arr);
            String str = "aabcacbdbbddd";
        System.out.println(removeDuplicate(str));
    }
}
