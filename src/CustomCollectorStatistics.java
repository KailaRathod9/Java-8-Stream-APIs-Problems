import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCollectorStatistics {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);

        DoubleSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingDouble(Integer::intValue));

        System.out.println(stats);
    }
}
