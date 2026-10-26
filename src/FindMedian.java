import java.util.List;

public class FindMedian {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        double median =numbers.stream()
                .sorted()
                .skip(numbers.size()-1/2)
                .limit(2-numbers.size()%2)
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println(median);
    }
}
