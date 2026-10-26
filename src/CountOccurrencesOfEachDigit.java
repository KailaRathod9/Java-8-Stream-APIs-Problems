import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesOfEachDigit {

    public static void main(String[] args) {
        String str = "hello 123 world 4566";

        Map<Character, Long> digitCounts = str.chars().mapToObj(c->(char)c).filter(Character::isDigit)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(digitCounts);
    }
}
