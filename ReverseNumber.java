public class ReverseNumber {
	// 颠倒数字
	public int reverseNumber(long x) {
		/**
		 * 思路：先把数据转换成String类型，然后计算出length，接着
		 * 分别取出个位，十位，百位等位置上的数字，最后按照原来的数据的逆序相加
		 */
		int len = String.valueOf(Math.abs(x)).length();
		long a, m = 0;
		for (int i = len - 1; i >= 0; i--) {
			a =  x / (int) Math.pow(10, i);
			x = x -  a * (int) Math.pow(10, i);
			m += a * (int) Math.pow(10, len - 1 - i);
			System.out.println("i = " + i + ", x = " + x + ", a = " + a + ", m = " + m);
		}
		if (m > (int) (Math.pow(2, 31) - 1) || m < (int) -(Math.pow(2, 31))) {
			m = 0;
			return (int) m;
		}
		return (int) m;
	}
	
	public static void main(String[] args) {
		long number = -2147447412;
		ReverseNumber reverseNumber = new ReverseNumber();
		long reverseN = reverseNumber.reverseNumber(number);
		System.out.println(reverseN);
	}

}
