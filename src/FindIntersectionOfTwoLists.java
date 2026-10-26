import java.util.List;
import java.util.stream.Collectors;

public class FindIntersectionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Integer> numbers2 = List.of(3,4,5,6);

        List<Integer> intersection = numbers.parallelStream().filter(numbers2::contains).collect(Collectors.toList());

        System.out.println("Intersection" + intersection);
    }
}
