package leet_code;

public class PalindromeNumber {
    // 判断是否是回文数
    public boolean isPalindromeNumber(long x) {
        /**
         * 思路：先把数据转换成String类型，然后计算出length，接着
         * 分别取出个位，十位，百位等位置上的数字，最后按照原来的数据的逆序相加得到顺序颠倒之后的数字
         */
        long len = String.valueOf(Math.abs(x)).length();
        long a, m = 0, d = x;
        for (long i = len - 1; i >= 0; i--) {
            a =  x / (long) Math.pow(10, i);
            x = x -  a * (long) Math.pow(10, i);
            m += a * (long) Math.pow(10, len - 1 - i);
            System.out.println("i = " + i + ", x = " + x + ", a = " + a + ", m = " + m);
        }
        // 判断是否是回文数
        if (m == d && d >= 0) {
            return true;
        }
        return false;
    }

    // 使用stringBuffer判断是否是回文数
    public boolean isPalindromeNumber2(long x) {
        String xString = String.valueOf(x);
        StringBuffer sb = new StringBuffer(xString);
        if (sb.reverse().toString().equalsIgnoreCase(xString) && x >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long number = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindromeNumber = palindromeNumber.isPalindromeNumber2(number);
        System.out.println(isPalindromeNumber);
    }
}
