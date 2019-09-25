package practice.leetcode;

public class SortArrayByParity905 {
	public int[] sortArrayByParity(int[] A) {
		int length = A.length;
		int[] B = new int[length];
		int min = 0;
		int max = length - 1;
		for (int i = 0; i < length; i++) {
			if (A[i] % 2 == 0) {
				B[min] = A[i];
				min++;
			} else {
				B[max] = A[i];
				max--;
			}
		}
		return B;
	}
}
