package practice.leetcode;

public class ToLowerCase709 {
	public String toLowerCase(String str) {
		StringBuffer lowerCase = new StringBuffer();
		for (char s : str.toCharArray()) {
			if (s >= 65 && s <= 90)
				s += 32;
			lowerCase.append(s);
		}
		return lowerCase.toString();
	}
}
