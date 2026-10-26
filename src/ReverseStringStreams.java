public class ReverseStringStreams {
    public static void main(String[] args) {
        String str = "Kailash";
        String reversed = str.chars()
                .mapToObj(c->String.valueOf((char)c))
                .reduce("", (a,b)->b+a);
        System.out.println(reversed);
    }
}
