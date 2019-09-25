package practice.leetcode;

public class BestTimetoBuyandSellStockII122 {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int price = 0;
		boolean buy = false;
		for (int i = 0; i < prices.length - 1; i++) {
			if (!buy) {
				price = prices[i];
				if (prices[i + 1] < prices[i]) {
					price = prices[i + 1];
					continue;
				} else
					buy = true;
			} else {
				if (prices[i + 1] > prices[i])
					continue;
				else {
					profit = profit + prices[i] - price;
					buy = false;
				}
			}
		}
		return profit;
	}
}
