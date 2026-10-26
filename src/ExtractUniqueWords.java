import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractUniqueWords {
    public static void main(String[] args) {
        String str = "hello world hello";

        List<String> uniqueWords = Arrays.stream(str.split(" "))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueWords);
    }
}
