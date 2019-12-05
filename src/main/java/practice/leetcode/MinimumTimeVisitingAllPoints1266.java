package practice.leetcode;

public class MinimumTimeVisitingAllPoints1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int x = Math.abs(points[i][0] - points[i - 1][0]);
            int y = Math.abs(points[i][1] - points[i - 1][1]);
            time += Math.min(x, y);
            time += Math.abs(x - y);
        }
        return time;
    }
}
