package practice.leetcode;

import java.util.Stack;

public class SplitaStringinBalancedStrings1221 {
    //    public int balancedStringSplit(String s) {
//        int result = 0;
//        Stack<Character> stack = new Stack<>();
//        char[] characters = s.toCharArray();
//        if (characters.length == 0) return 0;
//        stack.push(characters[0]);
//        for (int i = 1; i < characters.length; i++) {
//            if (stack.isEmpty()) {
//                stack.push(characters[i]);
//                continue;
//            }
//            if (characters[i] != stack.peek()) {
//                stack.pop();
//                if (stack.isEmpty()) {
//                    result++;
//                }
//            } else {
//                stack.push(characters[i]);
//            }
//        }
//        return result;
//    }
    public int balancedStringSplit(String s) {
        int result = 0;
        int num = 0;
        for (Character character : s.toCharArray()) {
            if (character == 'R') num++;
            else num--;
            if (num == 0) result++;
        }
        return result;
    }
}
