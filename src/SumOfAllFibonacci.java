import java.util.List;

public class SumOfAllFibonacci {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfFibonacci = numbers.stream()
                .filter(n -> {
                    int a = 0, b = 1;
                    while (b < n) {
                        int temp = b;
                        b = a + b;
                        a = temp;
                    }
                    return b == n;
                })
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Fibonacci Numbers: " + sumOfFibonacci);
    }
}
