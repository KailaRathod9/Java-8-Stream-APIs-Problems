import java.util.stream.Collectors;

public class RemoveAllSpecialChar {
    public static void main(String[] args) {
        String str = "abc@de$";

        String result = str.chars()
                .filter(c->Character.isLetterOrDigit(c) || Character.isWhitespace(c))
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
