package practice.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow500 {
	public String[] findWords(String[] words) {
		ArrayList<String> result = new ArrayList<String>();
		HashSet<Character> row1 = new HashSet<Character>();
		row1.add('q');
		row1.add('w');
		row1.add('e');
		row1.add('r');
		row1.add('t');
		row1.add('y');
		row1.add('u');
		row1.add('i');
		row1.add('o');
		row1.add('p');
		HashSet<Character> row2 = new HashSet<Character>();
		row2.add('a');
		row2.add('s');
		row2.add('d');
		row2.add('f');
		row2.add('g');
		row2.add('h');
		row2.add('j');
		row2.add('k');
		row2.add('l');
		HashSet<Character> row3 = new HashSet<Character>();
		row3.add('z');
		row3.add('x');
		row3.add('c');
		row3.add('b');
		row3.add('n');
		row3.add('m');
		for (String word : words) {
			int rowNum1 = 0;
			int rowNum2 = 0;
			int rowNum3 = 0;
			for (char w : word.toCharArray()) {
				if (w >= 'A' && w <= 'Z')
					w += 32;
				if (row1.contains(w))
					rowNum1++;
				if (row2.contains(w))
					rowNum2++;
				if (row3.contains(w))
					rowNum3++;
			}
			if (rowNum1 == word.length() || rowNum2 == word.length() || rowNum3 == word.length()) {
				result.add(word);
			}
		}
		return result.toArray(new String[result.size()]);
	}
}
