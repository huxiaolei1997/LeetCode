import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;
import java.util.List;

public class DividingNumbers {
    // 方法一,比较耗时
    public List<Integer> setDividingNumbers(int left, int right) {
        List<Integer> dividingNumbersList = new ArrayList<>();
        List<Integer> dividingNumbersList2 = new ArrayList<>();
        for (int a = left; a <= right; a++) {
            dividingNumbersList.add(a);
        }
        for (int i = left; i <= right; i++) {
            char[] charList = String.valueOf(i).toCharArray();
            int len = charList.length, dividingNumber = 0;
            //System.out.println(i);
            for (int j = 0; j < len; j++) {
                dividingNumber = Integer.valueOf(String.valueOf(charList[j]));
                //System.out.println(dividingNumber);
                if (dividingNumber == 0 || i % dividingNumber != 0) {
                    dividingNumbersList2.add(i);
                    break;
                }
            }
        }
        dividingNumbersList.removeAll(dividingNumbersList2);
        return dividingNumbersList;
    }

    // 方法二
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            if (valid(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    boolean valid(int num) {
        String value = Integer.toString(num);
        for (char c : value.toCharArray()) {
            if (c == '0') {
                return false;
            } else {
                // c-'0'是字符的减法操作，通常用于字符数字转换为整型数字。
                if (num % (c - '0') != 0) {
                    //System.out.println(c);
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DividingNumbers dividingNumbers = new DividingNumbers();
        int left = 1, right = 22;
        List<Integer> list = dividingNumbers.selfDividingNumbers(left, right);
        System.out.println(list.toString());
    }
}
