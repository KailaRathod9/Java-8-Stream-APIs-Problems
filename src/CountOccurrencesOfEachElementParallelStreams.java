import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesOfEachElementParallelStreams {


public static void main(String[] args) {
    List<String> words = List.of("apple", "banana" , "orange","orange");

    Map<String, Long> wordCounts = words.parallelStream()
            .collect(Collectors.groupingByConcurrent(s->s, Collectors.counting()));
    System.out.println(wordCounts);

}
}
