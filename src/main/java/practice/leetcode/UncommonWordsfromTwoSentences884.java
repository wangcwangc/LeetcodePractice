package practice.leetcode;

import java.util.ArrayList;

public class UncommonWordsfromTwoSentences884 {
	public String[] uncommonFromSentences(String A, String B) {
		A = A + " " + B;
		String[] strings = A.split(" ");
		ArrayList<String> result = new ArrayList<String>(strings.length);
		ArrayList<String> delete = new ArrayList<String>();
		for (String string : strings) {
			if (result.contains(string)) {
				result.remove(string);
				delete.add(string);
			} else if (!delete.contains(string))
				result.add(string);
		}
		return result.toArray(new String[result.size()]);
	}
}
