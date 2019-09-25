package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters1002 {
	public List<String> commonChars(String[] A) {
		List<String> commonChars = new ArrayList<String>();
		if (A.length <= 1)
			return commonChars;
		char ch = 0;
		for (char c : A[0].toCharArray()) {
			boolean exist = true;
			for (int i = 1; i < A.length; i++) {
				if (!A[i].contains(c + "")) {
					exist = false;
					break;
				}
			}
			if (exist) {
				ch = c;
				commonChars.add(c + "");
				break;
			}
		}
		if (commonChars.size() == 0)
			return commonChars;
		for (int i = 0; i < A.length; i++) {
			int index = A[i].indexOf(ch);
			A[i] = A[i].substring(0, index) + A[i].substring(index + 1);
		}
		commonChars.addAll(commonChars(A));
		return commonChars;
	}
}
