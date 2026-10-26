import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceEachWord {
    public static void main(String[] args) {
        String str = "hello World hello";

        Map<String, Long> wordCounts = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println(wordCounts);
    }
}
