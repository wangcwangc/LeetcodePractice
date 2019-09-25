package practice.leetcode;

public class ReverseString344 {
	public void reverseString(char[] s) {
		char change;
		int length = s.length;
		for (int i = 0; i < length; i++) {
			if (i == length - i - 1 || i == length - i) {
				break;
			}
			change = s[i];
			s[i] = s[length - i - 1];
			s[length - i - 1] = change;
		}
	}
}
