package practice.leetcode;

public class CanPlaceFlowers605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed.length == 1) {
			if (n == 1) {
				if (flowerbed[0] == 1)
					return false;
				else
					return true;
			} else
				return true;
		}
		boolean lastisnull = true;
		for (int i = 0; i < flowerbed.length - 1; i++) {
			if (flowerbed[i] == 0) {
				if (lastisnull) {
					if (flowerbed[i + 1] == 0) {
						flowerbed[i] = 1;
						n--;
					}
					lastisnull = false;
				} else {
					lastisnull = true;
				}
			} else {
				lastisnull = false;
			}
		}
		if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0)
			n--;
		return n <= 0;
	}
}
