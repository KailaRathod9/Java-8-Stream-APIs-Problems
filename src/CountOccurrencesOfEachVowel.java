import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesOfEachVowel {
    public static void main(String[] args) {
        String str = "hello World ";

        Map<Character, Long> wordCounts = str.chars().mapToObj(c->(char) c)
                .filter(c->"aeiou".contains(String.valueOf(c)))
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(wordCounts);

    }
}
