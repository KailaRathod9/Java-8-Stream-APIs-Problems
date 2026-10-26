import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "hello";

        Character firstNonRepeated = str.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Non Repeated: " + firstNonRepeated);


    }
}
