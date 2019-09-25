package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<String>(n);
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				result.add("FizzBuzz");
				continue;
			}
			if (i % 3 == 0) {
				result.add("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				result.add("Buzz");
				continue;
			}
			result.add(i + "");
		}
		return result;
	}
}
