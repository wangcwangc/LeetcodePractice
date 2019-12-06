package practice.leetcode;

public class LargestTriangleArea812 {
    public double largestTriangleArea(int[][] points) {
        double area;
        double maxArea = 0.0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    area = (points[i][0] * points[j][1] +
                            points[j][0] * points[k][1] +
                            points[k][0] * points[i][1] -
                            points[i][0] * points[k][1] -
                            points[j][0] * points[i][1] -
                            points[k][0] * points[j][1]) * 0.5;
                    area = Math.abs(area);
                    maxArea = maxArea >= area ? maxArea : area;
                }
            }
        }
        return maxArea;
    }
}
