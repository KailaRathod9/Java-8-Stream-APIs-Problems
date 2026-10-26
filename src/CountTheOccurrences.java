import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOccurrences {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","banana","orange");

        Map<String, Long> wordCounts = words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(wordCounts);

    }
}
