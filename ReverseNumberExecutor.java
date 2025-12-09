package in.ramesh.streamapi;

public class ReverseNumberExecutor {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original Number: " + number);
        System.out.println("Reverse Using Math               : " + new ReverseUsingMath().reverse(number));
        System.out.println("Reverse Using StringBuilder      : " + new ReverseUsingStringBuilder().reverse(number));
        System.out.println("Reverse Using Stream chars()     : " + new ReverseUsingStreamChars().reverse(number));
        System.out.println("Reverse Using IntStream          : " + new ReverseUsingIntStream().reverse(number));
        System.out.println("Reverse Using Pure Stream        : " + new ReverseUsingPureStream().reverse(number));
    }
}
