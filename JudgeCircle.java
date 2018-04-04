public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        // 机器人的初始横纵坐标
        int x = 0, y = 0;
        char[] charList = moves.toCharArray();
        int len = charList.length;
        for (int i = 0; i < len; i++) {
            if (charList[i] == 'L') {
                x = x - 1;
            } else if (charList[i] == 'R') {
                x = x + 1;
            } else if (charList[i] == 'U') {
                y = y + 1;
            } else if (charList[i] == 'D') {
                y = y - 1;
            }
        }
        // 在这里判断机器人是否回到初始位置
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String moves = "UDLRD";
        JudgeCircle judgeCircle = new JudgeCircle();
        boolean result = judgeCircle.judgeCircle(moves);
        System.out.println(result);
    }
}
