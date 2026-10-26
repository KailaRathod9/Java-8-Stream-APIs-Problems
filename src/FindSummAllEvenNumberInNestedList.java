import java.util.List;

public class FindSummAllEvenNumberInNestedList {
    public static void main(String[] args){
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        int sum = listOfLists.stream().flatMap(List::stream).
                filter(n->n%2==0)
                        .mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //For Sum of all Odd Numbers in aNested List
        //int sum = listOfLists.stream().flatMap(List::stream).
        // filter(n->n2!=0).sum()
    }
}
