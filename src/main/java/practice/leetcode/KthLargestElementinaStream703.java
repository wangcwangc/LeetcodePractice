package practice.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementinaStream703 {

}

class KthLargest {
	private int k;
	private PriorityQueue<Integer> numsQueue;

	public KthLargest(int k, int[] nums) {
		numsQueue = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			numsQueue.add(i);
		}
		this.k = k;
	}

	public int add(int val) {
		if (numsQueue.size() < k)
			numsQueue.offer(val);
		else if (numsQueue.peek() < val) {
			numsQueue.poll();
			numsQueue.offer(val);
		}
		return numsQueue.peek();
	}
}