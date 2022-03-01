package misc;

public class maxSubByRemoving1Num {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4,6,12,8,9,10,13};
        int n = arr.length;
        int ans = -1,lans = 0,prev = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(j == i){
                    continue;
                }else{
                    if(arr[j]>prev){
                        prev = arr[j];
                        lans++;
                    }else{
                        ans = Math.max(ans,lans);
                        lans = 0;
                        prev = -1;
                        break;
                    }
                    ans = Math.max(ans,lans);
                }
            }
        }
        System.out.println(ans);
    }
}
