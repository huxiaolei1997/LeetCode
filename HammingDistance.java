public class HammingDistance {
    public int hammingDistance(int x, int y) {
        // 在信息理论中，Hamming Distance 表示两个等长字符串在对应位置上不同字符的数目，
        // 我们以d(x, y)表示字符串x和y之间的汉明距离。从另外一个方面看，
        // 汉明距离度量了通过替换字符的方式将字符串x变成y所需要的最小的替换次数。
        //  举例说明以下字符串间的汉明距离为：
        // "karolin" and "kathrin" is 3.
        // "karolin" and "kerstin" is 3.
        // 1011101 and 1001001 is 2.
        // 2173896 and 2233796 is 3.
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        String zero = "";
        // 统计距离，初始化为 0
        int countDifferent = 0;
        int binaryXLen = binaryX.length();
        int binaryYLen = binaryY.length();
        int binaryX_Y = Math.abs(binaryXLen - binaryYLen);
        //int binaryX_Y = Math.abs(binaryXLen - binaryYLen);
        for (int i = 0; i < binaryX_Y; i++) {
            zero += '0';
        }

        if (binaryXLen < binaryYLen) {
            //binaryX_Y = binaryYLen - binaryXLen;
            zero = zero + binaryX;
            char[] charList = zero.toCharArray();
            char[] charList2 = binaryY.toCharArray();
            for (int j = 0; j < binaryYLen; j++) {
                if (charList[j] != charList2[j]) {
                    countDifferent++;
                }
            }
        } else {
            zero = zero + binaryY;
            char[] charList = binaryX.toCharArray();
            char[] charList2 = zero.toCharArray();
            for (int j = 0; j < binaryXLen; j++) {
                if (charList[j] != charList2[j]) {
                    countDifferent++;
                }
            }
        }

        //System.out.println(zero + ", " + zero.length() + ", countDifferent: " + countDifferent);
        //System.out.println(binaryX + ", " + binaryY);
        return countDifferent;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int countDifferent = hammingDistance.hammingDistance(3, 100);
        System.out.println(countDifferent);
    }
}
