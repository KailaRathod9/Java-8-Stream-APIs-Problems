import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessLargeDataParallel {
    public static void main(String[] args){
        List<Integer> numbers = IntStream.range(1,1000000).boxed().collect(Collectors.toList());

        long sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

    }
}
