import java.util.List;

public class FindAvrgOfAllEle {

    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,4,5);
        double average = input.stream().mapToInt(x -> x).sum()/input.size();
        System.out.println(average);

        //mapToInt(Integer::intValue).average().orElse(0)
    }
}
