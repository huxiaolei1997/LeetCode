public class GetSum {
    public int getSum(int a, int b) {
        /**
         *  计算机中小数点的位置事先约定的，因此，二进制表示的机器数在相对于小数点作 n 位左右或右移时，其实质就是该数乘以
         *  或除以 2 ^ n (n = 1, 2, ..., n)
         *  在计算机中，机器数都是以 补码 的形式存储的
         *  我们先看两个十进制数 m, n相加，m = 5, n = 8;
         *  首先 m + n 不进位和是 3，进位是 1， 所以m + n = 1 * 10 + 3  = 13，同理二进制数相加也是这样
         *  下面有一个例子 设a = 1, b = 2;
         *  a 0001
         *  b 0010
         *  不进位和                       0011 = 3
         *  进位（各个位置上没有进位）     0000 = 0
         *  因此当进位为 0 时，不进位和为 3 ，即a + b 之和为 3;
         *  下面再来看一个例子，假设 m = 5, n = 6;
         *  m 0101
         *  n 0110
         *  不进位和 0011 = 3
         *  进位     0100 = 4
         *  因此m + n = 0100 * 2 + 0011 = 4 << 1 + 3;
         *  然后
         *  3        0011
         *  4 << 1   1000
         *  不进位和 1011
         *  进位     0000
         *  所以当进位为 0 时，不进位和 11 即为m + n 的和
         */
        //
        while (b != 0) {
            int t = a ^ b; // 这里的 t 即 不进位和，当进位 b = 0 时，不进位和 t 即为 a + b 的和
            System.out.println("a & b = " + Integer.toBinaryString(a & b));
            b = (a & b) << 1; // 这里的a & b 即为 每次运算产生的 进位
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        GetSum getSum = new GetSum();
        int a = 3, b = 13;
        int sum = getSum.getSum(a, b);
        System.out.println(sum);
    }
}
