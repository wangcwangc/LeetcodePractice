package practice.leetcode;

import java.util.Arrays;

public class ArrayPartitionI561 {
	public static String path = "aaa";
	public int arrayPairSum(int[] nums) {
//		int length = nums.length;
//		for (int i = 1; i < length; i++) {
//			int change = nums[i];
//			int index = i;
//			while (index > 0 && nums[index - 1] > change) {
//				nums[index] = nums[index - 1];
//				index--;
//			}
//			nums[index] = change;
//		}
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			sum = sum + nums[i];
		}
		return sum;
	}

//	public void quickSort(int[] num, int left, int right) {
//		if (left >= right) {
//			return;
//		}
//		int key = num[left];
//		int i = left;
//		int j = right;
//		while (i < j) {
//			while (num[j] >= key && i < j) {
//				j--;
//			}
//			while (num[i] <= key && i < j) {
//				i++;
//			}
//			if (i < j) {
//				int temp = num[i];
//				num[i] = num[j];
//				num[j] = temp;
//			}
//		}
//		num[left] = num[i];
//		num[i] = key;
//		quickSort(num, left, i - 1);
//		quickSort(num, i + 1, right);
//	}
}
