import java.util.Comparator;
import java.util.List;

public class FindTheLongestPalindrome {
    public static void main(String[] args) {
        List<String> words = List.of("madam","racecar","apple","banana","level");

        String longestPalindrome = words.stream()
                .filter(word ->word.equals(new StringBuilder(word).reverse().toString()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestPalindrome);


        //For shortest palindrome min(Comparator.comparingInt(String::length))
    }
}
