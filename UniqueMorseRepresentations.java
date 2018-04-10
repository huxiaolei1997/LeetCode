import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        // 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串，
        // 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
        //String[] letter = new String[26];
        String[] letter = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        // 初始化一个Set集合，为了下面去除重复的元素
        Set set = new HashSet();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            char[] charList = words[i].toCharArray();
            int charLen = charList.length;
            String word = "";
            for (int j = 0; j < charLen; j++) {
                word = word + letter[charList[j] - 'a'];
            }
            //words[i] = word;
            set.add(word);
        }
        //System.out.println(Arrays.toString(set.toArray()));
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        UniqueMorseRepresentations uniqueMorseRepresentations = new UniqueMorseRepresentations();
        int len = uniqueMorseRepresentations.uniqueMorseRepresentations(words);
        System.out.println(len);
    }
}
