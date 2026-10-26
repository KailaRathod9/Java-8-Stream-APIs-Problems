import java.util.stream.Collectors;

public class RemoveAllDigitsFromString {
    public static void main(String[] args) {
        String str = "abc1123";
        String result = str.chars()
                .filter(c->!Character.isDigit(c))
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
    System.out.println(result);
    }
}
