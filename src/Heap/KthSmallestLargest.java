package Heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestLargest {
    public static int kthSmallest(int []arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//max heap

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }

    public static int kthLargest(int []arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5};
        System.out.println(kthSmallest(arr,3));
    }
}
