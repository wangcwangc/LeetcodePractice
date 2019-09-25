package practice.leetcode;

public class TransposeMatrix867 {
	public int[][] transpose(int[][] A) {
		int length = A[0].length;
		int[][] B = new int[length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < length; j++) {
				B[j][i] = A[i][j];
			}
		}
		return B;
	}
}
