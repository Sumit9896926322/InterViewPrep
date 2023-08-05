import java.util.ArrayList;
import java.util.List;

public class test {

    public static String calculateReviewScore(String review, List<String> lowerCaseProhibitedWords) {
        review = review.toLowerCase();

        String longSubstring = "";
        String currentSubstring = "";
        int currentSubstringStart = 0;

        for (int i = 0; i < review.length(); i++) {
            currentSubstring += review.charAt(i);
            while (containsProhibitedWord(currentSubstring, lowerCaseProhibitedWords)) {
                currentSubstringStart++;
                currentSubstring = review.substring(currentSubstringStart, i + 1);
            }

            if (currentSubstring.length() > longSubstring.length()) {
                longSubstring = currentSubstring;
            }
        }

        return longSubstring;
    }

    private static boolean containsProhibitedWord(String substring, List<String> prohibitedWords) {
        for (String word : prohibitedWords) {
            if (substring.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String review = "GoodProductButScrapAfterWash";
        List<String> prohibitedWords = new ArrayList<>();
        prohibitedWords.add("crap");
        prohibitedWords.add("odpro");

        String longestSubstring = calculateReviewScore(review, prohibitedWords);
        System.out.println(longestSubstring); // Output: "dProductButScra"
    }
}