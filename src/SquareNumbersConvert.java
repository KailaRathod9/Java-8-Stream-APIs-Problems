import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersConvert {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squares = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squares);

        //To find first : numbers.stream().findFirst().orElse();
    }
}
