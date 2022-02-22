package backtracking;

import java.util.Scanner;

public class maxScore {
    public static int maxWordScore(String words[],int frequency[],int scores[],int index,int score){

        if(index == words.length){
            return score;
        }
        String currStr = words[index];


        int scoreInclude = 0;
        int scoreExclude = 0;
        int tempScore = 0;
        Boolean flag = true;

        //after excluding the words
        scoreExclude = maxWordScore(words,frequency,scores,index+1,score);

        //check if it can be add into the array
        for(int i = 0;i<currStr.length();i++){
            char ch = currStr.charAt(i);
            if(frequency[ch-'a'] == 0) {
                flag = false;
            }
            else{
                frequency[ch-'a']--;
                tempScore += scores[ch-'a'];
            }
        }

        if(flag){
            scoreInclude = maxWordScore(words,frequency,scores,index+1,score + tempScore);
            for(int i = 0;i<currStr.length();i++){
                //backtrack to maintain frequency
                char ch = currStr.charAt(i);
                frequency[ch-'a']++;
            }
        }

        return  Math.max(scoreInclude,scoreExclude);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []words = new String[n];

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        int m = sc.nextInt();
        char []characters = new char[m];
        int frequency[] = new int[26];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = sc.next().charAt(0);
            frequency[characters[i]-'a']++;
        }
        int []scores = new int[26];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println(maxWordScore(words,frequency,scores,0,0));
    }
}


//4
//        dog cat dad good
//        9
//        a b c d d d g o o
//        1 0 9 5 0 0 3 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 0 0 0