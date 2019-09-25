package practice.leetcode;

public class HammingDistance461 {
	public int hammingDistance(int x, int y) {
		String xBinary = Integer.toBinaryString(x);
		String yBinary = Integer.toBinaryString(y);
		int result = 0;
		if (xBinary.length() > yBinary.length()) {
			for (int i = 0; i < yBinary.length(); i++) {
				if (yBinary.charAt(yBinary.length() - i - 1) != xBinary.charAt(xBinary.length() - i - 1))
					result++;
			}
			for (int i = yBinary.length(); i < xBinary.length(); i++) {
				if (xBinary.charAt(xBinary.length() - i - 1) == '1')
					result++;
			}
		} else {
			for (int i = 0; i < xBinary.length(); i++) {
				if (yBinary.charAt(yBinary.length() - i - 1) != xBinary.charAt(xBinary.length() - i - 1))
					result++;
			}
			for (int i = xBinary.length(); i < yBinary.length(); i++) {
				if (yBinary.charAt(yBinary.length() - i - 1) == '1')
					result++;
			}
		}
		return result;
	}
}
