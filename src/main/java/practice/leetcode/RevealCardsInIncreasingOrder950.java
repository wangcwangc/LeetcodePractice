package practice.leetcode;

import java.util.Arrays;

public class RevealCardsInIncreasingOrder950 {
	public int[] deckRevealedIncreasing(int[] deck) {
		int[] sig = new int[deck.length];
		int[] result = new int[deck.length];
		boolean jump = false;
		Arrays.sort(deck);
		int nums = 1;
		for (int i = 0; nums < deck.length; i++) {
			if (sig[i] == 0) {
				if (!jump) {
					result[i] = deck[i];
					sig[i] = 1;
					nums++;
					jump = true;
				} else {
					jump = false;
					continue;
				}
			}
			if (i == deck.length - 1)
				i = 0;
			if (nums == deck.length)
				break;
		}
		return result;
	}
}
