package in.ramesh.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ReverseUsingPureStream {
    public int reverse(int num) {
        String str = String.valueOf(num);
        return Integer.parseInt(
                IntStream.range(0, str.length())
                        .mapToObj(i -> str.charAt(str.length() - i - 1))
                        .map(String::valueOf)
                        .collect(Collectors.joining())
        );
    }
}
