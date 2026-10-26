import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 7, 7, 1, 9);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
