import java.util.Comparator;
import java.util.List;

public class LongestStringinList {
    public static void main(String[] args) {
        List<String> strings = List.of("Kohli", "Ram", "cherry");
        String longest = strings.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(longest);
    }
}
