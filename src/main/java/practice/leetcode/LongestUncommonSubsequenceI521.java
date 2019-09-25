package practice.leetcode;

public class LongestUncommonSubsequenceI521 {
	public int findLUSlength(String a, String b) {
		if (a.length() > b.length())
			return a.length();
		if (a.length() < b.length())
			return b.length();
		else {
			if (a.equals(b))
				return -1;
			else
				return a.length();
		}
	}
}
