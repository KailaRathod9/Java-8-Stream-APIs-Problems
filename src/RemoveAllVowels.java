import java.util.stream.Collectors;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String input = "hello world";
        String result = input.chars()
                .filter(c -> !"aeiou".contains(String.valueOf((char) c)))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Result: " + result);

    }
}
