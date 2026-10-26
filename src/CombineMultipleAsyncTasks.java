import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CombineMultipleAsyncTasks {
    public static void main(String[] args) {
        CompletableFuture<List<Integer>> future1 = CompletableFuture.supplyAsync(() -> List.of(1, 2, 3));
        CompletableFuture<List<Integer>> future2 = CompletableFuture.supplyAsync(() -> List.of(4, 5, 6));
        List<Integer> combined = Stream.of(future1, future2)
                .map(CompletableFuture::join)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Combined List: " + combined);
    }
}
