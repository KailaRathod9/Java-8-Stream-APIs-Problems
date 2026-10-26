import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandleExceptionsInStream {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> numbers = List.of("1", "2", "three", "4");
        List<Integer> parsedNumbers = numbers.stream()
                .flatMap(s -> {
                    try {
                        return Stream.of(Integer.parseInt(s));
                    } catch (NumberFormatException e) {
                        return Stream.empty();
                    }
                })
                .collect(Collectors.toList());
        System.out.println("Parsed Numbers: " + parsedNumbers);
    }
}
