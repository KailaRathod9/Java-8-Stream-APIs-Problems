import java.util.List;

public class SumOfAlleleGreaterThanthreshold {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

        int threshold =5;

        int sum = numbers.stream().filter(
                n->n>threshold
        ).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
