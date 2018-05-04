public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        /**
         * 参考资料（利用位运算符实现）
         * @see <a href="https://www.cnblogs.com/grandyang/p/7696387.html">https://www.cnblogs.com/grandyang/p/7696387.html</a>
         */
        String nString = Integer.toBinaryString(n);
        char[] nList = nString.toCharArray();
        int length = nList.length;
        for (int i = 0; i < length - 1; i++) {
            if (nList[i] == nList[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        HasAlternatingBits hasAlternatingBits = new HasAlternatingBits();
        boolean test = hasAlternatingBits.hasAlternatingBits(n);
        System.out.println(test);
    }
}
