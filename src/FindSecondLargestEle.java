import java.util.Comparator;
import java.util.List;

public class FindSecondLargestEle {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int secondLargest= numbers.stream().max(Integer::compareTo).get();
        System.out.println(secondLargest);
        int secondLargest1 = numbers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(secondLargest1);
    }
}
