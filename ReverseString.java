public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString(s));
    }
}
