import java.util.List;

public class CountNoOfElements {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        long count = numbers.stream().count();
        System.out.println("count: "+count);
    }
}
