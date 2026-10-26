import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);

        List<Integer> merge = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(merge);
    }
}
