package practice.leetcode;

import java.util.Arrays;

public class AssignCookies455 {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int result = 0;
		int index = 0;
		for (int i = 0; i < g.length; i++) {
			for (int j = index; j < s.length; j++) {
				if (s[j] >= g[i]) {
					result++;
					s[j] = 0;
					index = j;
					break;
				}
			}
		}
		return result;
	}
}
