import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMode {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 4);
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        int mode = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
        System.out.println("Mode: " + mode);
    }
}
