package practice.leetcode;

public class MinimumCosttoMergeStones1000 {
	public int mergeStones(int[] stones, int K) {
		if (stones.length == 1)
			return 0;
		int length = stones.length;
		if (length < K)
			return -1;
		while (true) {
			if (length == K)
				break;
			else if (length < K)
				return -1;
			length = length - (K - 1);
		}
		int size = stones.length - K + 1;
		int sum = 30000;
		int sumlate = 30000;
		int j = 0;
		int index = 0;
		for (int i = 0; i < stones.length; i++) {
			sum = sumK(stones, i, K);
			if (sum < sumlate) {
				sumlate = sum;
				index = j;
			}
			j++;
		}
		boolean cricle = false;
		int[] stonesnext = new int[size];
		if (index >= stonesnext.length) {
			index = 0;
			cricle = true;
		}
		stonesnext[index] = sumlate;
		j = 0;
		for (int i = 0; i < stones.length; i++) {
			if (cricle) {
				if (j >= stonesnext.length)
					break;
				if (j == index) {
					j++;
				}
				stonesnext[j] = stones[i];
				j++;
			} else {
				if (i >= index && i < index + K)
					continue;
				if (j == index) {
					j++;
				}
				stonesnext[j] = stones[i];
				j++;
			}
		}
		return sumlate + mergeStones(stonesnext, K);
	}

	public int sumK(int[] stones, int index, int K) {
		int sum = 0;
		int num = 0;
		for (int i = index; i < index + K; i++) {
			if (num == K)
				break;
			if (i >= stones.length)
				i = i - stones.length;
			sum += stones[i];
			num++;
		}
		return sum;
	}
}
