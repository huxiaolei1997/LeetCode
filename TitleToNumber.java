public class TitleToNumber {
    public int titleToNumber(String s) {
        // 实际上相当于一种二十六进制转十进制的问题，只要一位一位的转换即可
        int n = s.length();
        int res = 0;
        // 写法一
        // int tmp = 1;
//        for (int i = n; i >= 1; --i) {
//            res += (s.toCharArray()[i - 1] - 'A' + 1) * tmp;
//            tmp *= 26;
//        }
        // 写法二
        char[] charList = s.toCharArray();
        for (int i = 0; i < n; i++) {
            res += (charList[i] - 'A' + 1) * Math.pow(26, n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AC";
        TitleToNumber titleToNumber = new TitleToNumber();
        int result = titleToNumber.titleToNumber(s);
        System.out.println(result);
    }
}
