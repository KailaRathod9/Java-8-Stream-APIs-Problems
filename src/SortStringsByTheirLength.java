import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class SortStringsByTheirLength {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","kiwi");
        List<String> sortedWords = words.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedWords);
    }
}
