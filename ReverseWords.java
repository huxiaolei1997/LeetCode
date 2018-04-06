import java.util.Arrays;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] sList = s.split(" ");
        System.out.println(Arrays.toString(sList));
        int len = sList.length;
        StringBuilder sb = new StringBuilder();
        //StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            StringBuilder stringBuilder = new StringBuilder(sList[i]);
            //stringBuilder.de
            stringBuilder = stringBuilder.reverse();
            sb.append(stringBuilder + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String s = "Let's take LeetCode contest";
        String sr = reverseWords.reverseWords(s);
        System.out.println(sr);
    }
}
