import java.util.List;

public class CheckIfListContainSpeciicEle {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        boolean contains = list.stream().anyMatch(x->x==3);
        System.out.println("contains 3 : " + contains);
    }
}
