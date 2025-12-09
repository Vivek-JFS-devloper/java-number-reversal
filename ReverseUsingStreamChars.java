package in.ramesh.streamapi;

import java.util.stream.Collectors;

public class ReverseUsingStreamChars {
    public int reverse(int num) {
        String reversed = new StringBuilder(String.valueOf(num))
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return Integer.parseInt(reversed);
    }
}
