import java.util.Arrays;
import java.util.List;

public class ProductOfAllEle {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,4,5);

        int product = input.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Product:" +product);
    }
}
