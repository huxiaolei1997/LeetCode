import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EffectiveParentheses {
    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    //括号必须以正确的顺序关闭，"()" 和 "()[]{}" 是有效的但是 "(]" 和 "([)]" 不是。
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sk.push('(');
            }
            if (s.charAt(i) == ')') {
                if (!sk.isEmpty() && sk.pop() == '(')
                    continue;
                else
                    return false;
            }
            if (s.charAt(i) == '[') {
                sk.push('[');
            }
            if (s.charAt(i) == ']') {
                if (!sk.isEmpty() && sk.pop() == '[')
                    continue;
                else
                    return false;
            }
        }
        if (sk.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "(){}[]fdfjkadlfjadf()[fjdklsaf]fdjfls{fdjkfla}";
        EffectiveParentheses effectiveParentheses = new EffectiveParentheses();
        boolean result = effectiveParentheses.isValid(s);
        System.out.println(result);
    }
}
