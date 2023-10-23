import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[{]";
        System.out.println(ValidParenthesisSolution(s));
    }

    public static boolean ValidParenthesisSolution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if ( c == '{') {
                stack.push('}');
            } else if ( c == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
