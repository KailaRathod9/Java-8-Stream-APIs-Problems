import java.util.stream.IntStream;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome =
                IntStream.range(0,str.length()/2)
                        .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));

        System.out.println("isPalindrome : " + isPalindrome);
    }
}
