package practice.leetcode;

import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case ')':
                    if (stack.isEmpty()) return false;
                    else if (stack.peek() != '(') {
                        return false;
                    } else stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty()) return false;
                    else if (stack.peek() != '{') {
                        return false;
                    } else stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty()) return false;
                    else if (stack.peek() != '[') {
                        return false;
                    } else stack.pop();
                    break;
                default:
                    stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
