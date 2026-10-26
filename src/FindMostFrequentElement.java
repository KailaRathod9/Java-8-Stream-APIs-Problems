import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostFrequentElement {
    public static void main(String[] args) {


        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        String mostFrequent = words.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most Frequent: " + mostFrequent);

    }
}
