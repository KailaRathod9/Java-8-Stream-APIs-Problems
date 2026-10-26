import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        List<Integer> flattened = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened : " + flattened);
    }
}
