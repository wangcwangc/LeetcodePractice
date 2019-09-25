package practice.leetcode;

public class SumofEvenNumbersAfterQueries985 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] result = new int[queries.length];
		int sumEven = sumEven(A);
		for (int i = 0; i < queries.length; i++) {
			if (A[queries[i][1]] % 2 == 0) {
				if (queries[i][0] % 2 == 0) {
					sumEven += queries[i][0];
				} else {
					sumEven -= A[queries[i][1]];
				}
			} else {
				if (!(queries[i][0] % 2 == 0)) {
					sumEven += queries[i][0] + A[queries[i][1]];
				}
			}
			A[queries[i][1]] += queries[i][0];
			result[i] = sumEven;
		}
		return result;
	}

	public int sumEven(int[] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0)
				sum += A[i];
		}
		return sum;
	}
}
