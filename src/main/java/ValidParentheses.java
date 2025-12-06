import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean result = isValid("()[]{}");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if ((c == ')' && open != '(') ||
                        (c == '}' && open != '{') ||
                        (c == ']' && open != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}
