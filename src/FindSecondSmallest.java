import java.util.List;

public class FindSecondSmallest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int secondSmallest = numbers.stream().sorted().skip(1).findFirst().orElse(0);
        System.out.println(secondSmallest);
    }
}
