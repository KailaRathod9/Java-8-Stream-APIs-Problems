import java.util.stream.Collectors;
import java.util.List;
public class CovertInUpperCase {

    public static void main(String[] args) {
        List<String> words = List.of("hello","world");

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords);
    }
}
