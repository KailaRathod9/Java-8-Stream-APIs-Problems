
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingParallelStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);

        List<Integer> sortedNumbers = numbers.parallelStream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
