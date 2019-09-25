package practice.leetcode;

public class DIStringMatch942 {
	public int[] diStringMatch(String S) {
		int length = S.length();
		int[] A = new int[length + 1];
		int max = length;
		int min = 0;
		int i = 0;
		for (char s : S.toCharArray()) {
			switch (s) {
			case 'I':
				A[i] = min;
				min++;
				break;
			case 'D':
				A[i] = max;
				max--;
				break;
			default:
				break;
			}
			i++;
		}
		if (max == length)
			A[i] = max;
		else if (min == 0)
			A[i] = min;
		else
			A[i] = min + 1;
		return A;
	}
}
