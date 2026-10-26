public class AllDigitSumFromString {
    public static void main(String[] args) {
        String str = "123 world 23";
        int sum = str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
