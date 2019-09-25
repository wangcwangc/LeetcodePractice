package practice.leetcode;

public class FindtheDifference389 {
	public char findTheDifference(String s, String t) {
		t = t + s;
		int result = 0;
		for (char c : t.toCharArray()) {
			result ^= c;
		}
		return (char) result;
	}
}
