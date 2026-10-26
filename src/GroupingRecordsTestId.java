
import java.util.*;
import java.util.stream.*;

//GroupingR Records Test ID
public class GroupingRecordsTestId {
    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "T1-R1-FALSE",
                "T1-R2-FALSE",
                "T2-R1-FALSE",
                "T2-R2-TRUE"
        );

        Map<String, Long> result = input.stream()
                .map(s -> s.split("-"))
                .collect(Collectors.groupingBy(
                        arr -> arr[0],
                        TreeMap::new,
                        Collectors.filtering(
                                arr -> Boolean.parseBoolean(arr[2]),
                                Collectors.counting()
                        )
                ));

        result.forEach((test, count) ->
                System.out.println(test + "-" + count + " PASSED")
        );
    }
}
