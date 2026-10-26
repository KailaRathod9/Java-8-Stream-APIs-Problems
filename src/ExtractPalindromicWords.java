import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractPalindromicWords {
    public static void main(String[] args) {
        String str = "madam racecar apple banana level";
        List<String> palindromes = Arrays.stream(str.split(" "))
                .filter(word->word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes);
    }
}
