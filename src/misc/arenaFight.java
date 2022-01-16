package misc;

import java.util.ArrayList;

public class arenaFight {
    public static ArrayList<Integer> arenaWinners(ArrayList<Integer> arr){
        int i = 0;
        while(i<arr.size()-1){
            if(arr.get(i)<0 ){
                if(i-1 >= 0) {
                    if ((arr.get(i - 1) < 0)) {
                        //No fight because of same potential
                        i++;
                    } else {
                        //remove the person with less power
                        if (Math.abs(arr.get(i)) > Math.abs(arr.get(i - 1)))
                            arr.remove(i - 1);
                        else if (Math.abs(arr.get(i)) < Math.abs(arr.get(i - 1)))
                            arr.remove(i);
                        else {
                            //remove both players with same power
                            arr.remove(i);
                            arr.remove(i - 1);
                        }
                    }
                }else{
                    //no previous guy found for fighting
                    i++;
                }

            }
            else if(arr.get(i)>=0 ){
                if(i+1 < arr.size()) {
                    if (arr.get(i + 1) > 0) {
                        //No fight because of same potential
                        i++;
                    } else {
                        if (Math.abs(arr.get(i)) > Math.abs(arr.get(i + 1)))
                            arr.remove(i + 1);
                        else if (Math.abs(arr.get(i)) < Math.abs(arr.get(i + 1)))
                            arr.remove(i);
                        else {
                            arr.remove(i);
                            arr.remove(i + 1);
                        }
                    }
                }else{
                    //No next guy found for fighting
                    i++;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int fighters[] = {5,10,-5};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i:fighters)
            arr.add(i);
        System.out.println(arenaWinners(arr));
    }
}
