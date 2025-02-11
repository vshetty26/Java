public class AppendCodePointExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.appendCodePoint(33);  // Appends '!'
        System.out.println("Resulting string: " + builder.toString());
    }
}
