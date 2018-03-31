import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EffectiveParentheses {
    // 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    // 括号必须以正确的顺序关闭，"()" 和 "()[]{}" 是有效的但是 "(]" 和 "([)]" 不是。
    // 最后如果括号都能正确的闭合，那么最后栈内没有任何元素。
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sk.push('(');
            }

            if (s.charAt(i) == ')') {
                if (sk.isEmpty() || sk.peek() != '(') {
                    return false;
                }
                // 如果栈顶的元素等于 '('，那么栈顶的元素将会被移除，最后如果字符串内的括号都能正确的闭合，sk是一个空栈
                sk.pop();
            }

            if (s.charAt(i) == '[') {
                sk.push('[');
            }

            if (s.charAt(i) == ']') {
                if (sk.isEmpty() || sk.peek() != '[') {
                    return false;
                }
                sk.pop();
            }

            if (s.charAt(i) == '{') {
                sk.push('{');
            }

            if (s.charAt(i) == '}') {
                if (sk.isEmpty() || sk.peek() != '{') {
                    return false;
                }
                sk.pop();
            }

        }
        return sk.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]]fdfadsf}";
        EffectiveParentheses effectiveParentheses = new EffectiveParentheses();
        boolean result = effectiveParentheses.isValid(s);
        System.out.println(result);
    }
}
