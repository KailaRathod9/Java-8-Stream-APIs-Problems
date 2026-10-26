import java.util.List;
import java.util.stream.IntStream;

public class SumOfAllEvenIndexedEle {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEvenIndexed = IntStream.range(0, numbers.size())
                .filter(i -> i % 2 == 0)
                .map(numbers::get)
                .sum();
        System.out.println("Sum of Even-Indexed Elements: " + sumOfEvenIndexed);
    }
}
