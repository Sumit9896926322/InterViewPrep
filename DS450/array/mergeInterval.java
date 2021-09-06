package array;

import java.util.*;

public class mergeInterval {
	    public int[][] merge(int[][] intervals) {
	         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
	         ArrayList<int[]> ans = new ArrayList<int[]>();
	         int n = intervals.length;
	         int current[] = intervals[0];
	         for(int i = 1;i<n;i++){
	             if(intervals[i][0] <= current[1]){
	                 current[0] = Math.min(current[0],intervals[i][0]); 
	                 current[1] = Math.max(current[1],intervals[i][1]); 
	             }else{
	                  ans.add(current);
	                  current = intervals[i];
	             }
	         }
	        ans.add(current);
	        int fans[][] = new int[ans.size()][ans.size()];
	        for(int i = 0;i<ans.size();i++){
	            fans[i] = ans.get(i);
	        }
	        return fans;
	    }
	    
	    public static void main(String[] args) {
		  	
	    	//pass 2d array as input
	    }
}
