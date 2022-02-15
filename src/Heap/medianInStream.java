package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianInStream {
    public static void findMedianInStream(int []arr) {
        int i = 0;
        while(i<arr.length){
            int src = arr[i];
            int target = arr[src-1];
            if(src <= 0)
                i++;
            else{
                if(src == target){
                    arr[src-1] = -2;
                }else{

                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
