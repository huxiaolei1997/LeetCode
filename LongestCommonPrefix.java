package leet_code;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        int len = strs.length;
//        int charLen;
//        char[] charList = null;
//        String charWord = "";
//        //System.out.println(strs[0]);
//        if (len == 1) {
//            return strs[0];
//        }
//        if (len == 0) {
//            return charWord;
//        }
//        for (int i = 0; i < len; i++) {
//            charList = strs[i].toCharArray();
//            charLen = charList.length;
//            for (int j = 0; j < charLen; j++){
//                //charWord += String.valueOf(charList[j]).trim();
//                //System.out.println(String.valueOf(charList[j]));
//                charWord += charList[j];
//                if (strs[i+1].indexOf(charWord) < 0) {
//                    return "";
//                }
//
//                //if (strs[i+1].indexOf(charWord) >= 0) {
//                    //charWord += charList[j];
//                 //   System.out.println(charWord);
//                    //return charWord;
//               // }
//
//            }
//            return charWord.trim();
//        }
//        return strs[0];
        if(strs == null || strs.length==0) return "";
        String prifex = strs[0];        // 默认将第一个认为是最长共同
        for(int i=1;i<strs.length;i++){
            // 将当前最长共同字符串和当前数组中的对比,把小的那个作为长度
            int len = prifex.length()>strs[i].length() ? strs[i].length():prifex.length();
            int j=0;
            for(j=0;j<len;j++){
                // 逐个字符比较,不等的时候退出
                if(prifex.charAt(j)!=strs[i].charAt(j))
                    break;
            }// 退出的j即当前的最小,整个遍历结束后就是整个的最小了
            prifex = prifex.substring(0,j);
        }
        return prifex;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"aa", "ab"};
        String charWord = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println("longestCommonPrefix = " + charWord);
        //System.out.println("longestCommonPrefix = " + longestCommonPrefix.longestCommonPrefix(strs));
        //System.out.println("longestCommonPrefix = " + longestCommonPrefix.longestCommonPrefix(strs) + ", " + strs[0]);
        //System.out.println(Arrays.toString(strs) + ", " + strs.length);
    }
}
