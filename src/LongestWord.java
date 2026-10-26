import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String input = "hellow world this is a test";
        String longestWord = Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestWord);

        //Min(Comparator.comparingInt(String::length))
    }
}
