import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByTheirLength {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World","kiwi");

        Map<Integer, List<String>> groupingByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupingByLength);
    }
}
