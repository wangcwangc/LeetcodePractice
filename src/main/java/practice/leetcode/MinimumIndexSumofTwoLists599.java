package practice.leetcode;

import java.util.ArrayList;

public class MinimumIndexSumofTwoLists599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		int lengthMin = 2001;
		ArrayList<String> arraylist1 = new ArrayList<String>();
		ArrayList<String> arraylist2 = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		for (String s : list1) {
			arraylist1.add(s);
		}
		for (String s : list2) {
			arraylist2.add(s);
		}
		for (String s : list1) {
			if (arraylist2.contains(s)) {
				int length = arraylist1.indexOf(s) + arraylist2.indexOf(s);
				if (length < lengthMin) {
					result.clear();
					result.add(s);
					lengthMin = length;
				} else if (length == lengthMin) {
					result.add(s);
				}
			}
		}
		return result.toArray(new String[0]);
	}
}
