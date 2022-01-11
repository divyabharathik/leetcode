import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[(]"));
        System.out.println(isValid("{}"));
        System.out.println(isValid("}("));

    }

    public static boolean isValid(String s) {
        Stack<Character> paran = new Stack<>();
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    paran.push(s.charAt(i));
                } else if ((paran.size() >= 1) && ((s.charAt(i) == ')' && paran.peek() == '(') || (s.charAt(i) == '}' && paran.peek() == '{') || (s.charAt(i) == ']' && paran.peek() == '['))) {
                    paran.pop();
                } else {
                    return false;
                }
            }
            return paran.empty();
        } else {
            return false;
        }
    }
}
