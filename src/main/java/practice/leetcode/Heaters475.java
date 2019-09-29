package practice.leetcode;

import java.util.Arrays;

public class Heaters475 {
    public int findRadius(int[] houses, int[] heaters) {
        int[] distances = new int[houses.length];
        Arrays.fill(distances, Integer.MAX_VALUE);
        for (int i = 0; i < heaters.length; i++) {
            for (int j = 0; j < houses.length; j++) {
                int distance = Math.abs(houses[j] - heaters[i]);
                if (distance < distances[j]) {
                    distances[j] = distance;
                }
            }
        }
        Arrays.sort(distances);
        return distances[distances.length - 1];
    }
}
