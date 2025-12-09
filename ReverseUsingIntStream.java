package in.ramesh.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ReverseUsingIntStream {
    public int reverse(int num) {
        String str = String.valueOf(num);
        String reversed = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(reversed);
    }
}
