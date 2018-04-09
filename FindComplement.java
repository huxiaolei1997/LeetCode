public class FindComplement {
    // 方法一
    public int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        //int a = ~num;
        //binaryNum = binaryNum.replace('0', '1');
        char[] charList = binaryNum.toCharArray();
        int len = charList.length;
        for (int i = 0; i < len; i++) {
            if (charList[i] == '0') {
                charList[i] = '1';
            } else if (charList[i] == '1') {
                charList[i] = '0';
            }
        }
        // 把替换之后的charList转换成int类型
        int result = Integer.parseInt(String.valueOf(charList), 2);
        System.out.println(result);
        return result;
    }

    // 方法二

    public static void main(String[] args) {
        FindComplement findComplement = new FindComplement();
        System.out.println(findComplement.findComplement(5));;
    }
}
