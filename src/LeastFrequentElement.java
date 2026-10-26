import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeastFrequentElement {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","apple","orange","banana","apple");

        String leaseFrequent = words.stream()
                .collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Least Frequent: " + leaseFrequent);

    }
}
