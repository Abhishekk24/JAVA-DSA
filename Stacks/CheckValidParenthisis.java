import java.util.*;

public class CheckValidParenthisis {
    static boolean check(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
                stack.push(exp.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                // System.out.println("Pop operation: "+ch);
                if ((exp.charAt(i) == ')' && ch == '(') || (exp.charAt(i) == ']' && ch == '[')
                        || (exp.charAt(i) == '}' && ch == '{')) {
                    // Do nothing, just continue checking
                } else {
                    return false;
                }
            }
        }
        // Check if the stack is empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "()[]{}{[()]()}";

        if (check(expression)) {
            System.out.println("Expression is valid");
        } else {
            System.out.println("Expression is not valid");
        }
    }
}
