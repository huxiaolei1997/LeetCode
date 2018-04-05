import java.util.*;

public class FindWords {
    public String[] findWords(String[] words) {
        String[] Str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<Str.length; i++) {
            for(char c : Str[i].toCharArray()) {
                map.put(c, i);
            }
         }
        int index = 0;
        List<String> res = new ArrayList<>();
        for(String word : words) {
            if (word.equals("")) {
                continue;
            }
            index = map.get(word.toUpperCase().toCharArray()[0]);
            for(char c : word.toUpperCase().toCharArray()) {
                if(map.get(c) != index) {
                    index = -1;//不用设置flag 直接把index设为-1即可
                    break;
                }
            }
            if(index != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }

//    public boolean isValid(String words) {
//        String[] word = new String[]{"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
//        //List<String> wordList = new ArrayList<>();
//        int wordsLen = words.length(), wordLen = word.length;
//        //int singleWordLen = words[i].length();
//        char[] charList = words.toCharArray();
//        for (int j = 0; j < wordLen; j++) {
//            for (int m = 0; m < charList.length; m++) {
//                if (!word[j].contains(String.valueOf(charList[m]))){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        FindWords findWords = new FindWords();
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] list = findWords.findWords(words);
        System.out.println(Arrays.toString(list));
    }
}
