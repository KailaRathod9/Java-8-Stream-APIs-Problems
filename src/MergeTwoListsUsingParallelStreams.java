import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListsUsingParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers1=  List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2= List.of(6, 7, 8, 9);

        List<Integer> merge = Stream.concat(numbers1.parallelStream(),numbers2.parallelStream())
                .collect(Collectors.toList());
        System.out.println(merge);
    }
}
