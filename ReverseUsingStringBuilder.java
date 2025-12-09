package in.ramesh.streamapi;

public class ReverseUsingStringBuilder {
    public int reverse(int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }
}
