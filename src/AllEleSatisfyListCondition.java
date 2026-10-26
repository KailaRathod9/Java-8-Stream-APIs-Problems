import java.util.List;

public class AllEleSatisfyListCondition {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        boolean allEven = numbers.stream().allMatch(n->n%2==0);
        System.out.println(allEven);

        //Any one ele satisfy : numbers.stream().anyMatch(n->n%2==0);
    }
}
