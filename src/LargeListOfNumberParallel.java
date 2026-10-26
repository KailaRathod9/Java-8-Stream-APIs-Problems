import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class LargeListOfNumberParallel {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        long sum = numbers.parallelStream().mapToLong(Integer::intValue).sum();

        System.out.println(sum);

    }
}
