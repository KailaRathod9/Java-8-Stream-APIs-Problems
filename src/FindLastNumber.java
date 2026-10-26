import java.util.List;

public class FindLastNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int last = numbers.get(numbers.size()-1);
        int last1 =numbers.stream().reduce((a,b)->b).orElse(0);
        System.out.println(last);
        System.out.println(last1);
    }
}
