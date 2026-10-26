import java.util.List;
import java.util.stream.Collectors;


public class FilterStringParallelStreams {
    List<String> words = List.of("apple","banana","kiwi","mango");

    List<String> filterWords = words.parallelStream().
            filter(word->word.length()>4)
            .collect(Collectors.toList());

        //System.out.println(filterWords);

}
