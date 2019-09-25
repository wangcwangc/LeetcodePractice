package practice.leetcode;

public class VerifyinganAlienDictionary953 {
	public boolean isAlienSorted(String[] words, String order) {
		for (int i = 0; i < words.length - 1; i++) {
			char[] wordArray1 = words[i].toCharArray();
			char[] wordArray2 = words[i + 1].toCharArray();
			for (int j = 0; j < wordArray1.length; j++) {
				if (j >= wordArray2.length)
					return false;
				if (wordArray1[j] == wordArray2[j])
					continue;
				else if (order.indexOf(wordArray1[j]) > order.indexOf(wordArray2[j]))
					return false;
				else
					break;
			}
		}
		return true;
	}
}
