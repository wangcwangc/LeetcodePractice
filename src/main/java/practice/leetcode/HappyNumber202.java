package practice.leetcode;

import java.util.HashSet;

public class HappyNumber202 {
	HashSet<Integer> has = new HashSet<Integer>();

	public boolean isHappy(int n) {
		int sum = 0;
		for (char num : String.valueOf(n).toCharArray()) {
			int number = Integer.parseInt(num + "");
			sum = sum + number * number;
		}
		if (sum == 1)
			return true;
		else {
			if (has.contains(sum))
				return false;
			else {
				has.add(sum);
				return isHappy(sum);
			}
		}
	}
}
