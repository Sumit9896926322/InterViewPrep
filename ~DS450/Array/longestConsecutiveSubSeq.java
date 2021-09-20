package array;
import java.util.*;
public class longestConsecutiveSubSeq {
	public static int longestSubSeq(int arr[],int n){
		TreeMap<Integer,Integer> hash = new TreeMap<Integer,Integer>();
		int ans = 1;
		
		for(int i:arr)
			hash.put(i,1);
		int currans = 1;
	
		for(Map.Entry<Integer,Integer> mp :hash.entrySet()){
			int value = mp.getKey();
			if(hash.containsKey(value+1)) {

				currans++;
			}
			else {
				ans = Math.max(ans,currans);
				currans = 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int ans = longestSubSeq(arr,n);
		System.out.println(ans);
	}
}
