import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> evenNumber = list.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(evenNumber);

        //For odd n->n%2!=0
    }
}
