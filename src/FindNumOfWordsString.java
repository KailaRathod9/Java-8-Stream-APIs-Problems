import java.util.Arrays;

public class FindNumOfWordsString {
    public static void main(String[] args) {
        String input = "hellow world this is a test";
        long wordCount = Arrays.stream(input.split(" ")).count();
        System.out.println(wordCount);
    }
}
