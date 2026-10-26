import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDifferenceOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 3, 2, 9, 10);

        List<Integer> difference = list1.stream().filter(n->!list2.contains(n)).collect(Collectors.toList());
        System.out.println(difference);
    }
}
