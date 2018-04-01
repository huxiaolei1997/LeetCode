public class JewelsInStones {
    // 宝石与石头
    public int numJewelsInStones(String J, String S) {
        int totalNumber = 0;
        for (int i = 0, len = S.length(); i < len; i++) {
            for (int j = 0, len2 = J.length(); j < len2; j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    totalNumber++;
                }
            }
        }
        return totalNumber;
    }

    public static void main(String[] args) {
        String S = "z", J = "ZZ";
        JewelsInStones jewelsInStones = new JewelsInStones();
        System.out.println(jewelsInStones.numJewelsInStones(S, J));
    }
}
