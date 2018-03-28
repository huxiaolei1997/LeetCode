package leet_code;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    // 罗马数字转换成整数
    public int romanToInt(String s) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        //int integerNumber = hashMap.get(s);
        char[] charList = s.toCharArray();
        int number = 0;
        //System.out.println(charList.length);
        for (int i = 0; i < s.length(); i++) {
           if (i+1 >= s.length() || hashMap.get(String.valueOf(charList[i+1])) <= hashMap.get(String.valueOf(charList[i]))) {
                number += hashMap.get(String.valueOf(charList[i]));
            } else {
                number -= hashMap.get(String.valueOf(charList[i]));
            }
        }
        //hashMap.forEach((k, v) -> System.out.println("k = " + k + ", " + "v = " + v));
        return number;
    }

    public static void main(String[] args) {
        String s = "MCMXCVI";
        RomanNumerals romanNumerals = new RomanNumerals();
        System.out.println(romanNumerals.romanToInt(s));
        //romanNumerals.romanToInt(s);
    }
}
