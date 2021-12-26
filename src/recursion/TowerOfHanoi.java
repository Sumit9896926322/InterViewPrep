package recursion;
import java.util.*;

public class TowerOfHanoi {
    public static void TOH(String source,String helper,String destination,int disk){
        if(disk == 0)
            return;
        TOH(source,destination,helper,disk-1);
        System.out.println("Move"+ disk +"disk from "+source+" to "+destination );
        TOH(helper,source,destination,disk-1);

    }
    public static int[] firstIndex(int arr[],int index,int n,int fsf) {
        if(index == arr.length)
            return new int[fsf];
        if(arr[index] == n)
            fsf+=1;

        int res[]  = firstIndex(arr,index+1,n,fsf);
        if(arr[index] == n)
            res[fsf-1] = index;
        return res;
    }


    public static void main(String[] args) {
        TOH("s","h","d",3);
        int arr[] = {1,2,3,4,3,9,8,7,3};
        int res[] = firstIndex(arr,0,3,0);

        for(int num:res)
            System.out.print(num+" ");
    }
}
