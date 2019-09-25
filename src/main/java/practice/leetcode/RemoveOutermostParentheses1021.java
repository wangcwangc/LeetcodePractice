package practice.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveOutermostParentheses1021 {
	public String removeOuterParentheses(String S) {
		StringBuffer stringBuffer = new StringBuffer();
		Queue<Character> queue = new LinkedList<Character>();
		boolean start = true;
		for (char s : S.toCharArray()) {
			if (s == '(') {
				if (start) {
					start = false;
					continue;
				}
				queue.add(s);
				stringBuffer.append(s);
			}
			if (s == ')') {
				if (queue.isEmpty()) {
					start = true;
					continue;
				}
				stringBuffer.append(s);
				queue.poll();
			}
		}
		return stringBuffer.toString();
	}
}
