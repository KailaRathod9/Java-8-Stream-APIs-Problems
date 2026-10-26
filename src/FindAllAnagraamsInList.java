import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllAnagraamsInList {
    public static void main(String[] args) {

        List<String> words = List.of("listen", "silent", "enlist", "google", "inlets");
        String target = "silent";
        List<String> anagrams = words.stream()
                .filter(word -> Arrays.equals(
                        word.chars().sorted().toArray(),
                        target.chars().sorted().toArray()
                ))
                .collect(Collectors.toList());
        System.out.println("Anagrams: " + anagrams);
     }
}
