import java.util.List;
import java.util.stream.Collectors;

public class SortAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 5, 6, 7, 8, 9,2, 3 );
         List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
         System.out.println(sorted);

    }
}
