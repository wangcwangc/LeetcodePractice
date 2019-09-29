package practice.leetcode;

public class ConstructtheRectangle492 {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int sqrt = (int) Math.sqrt(area);
        for (int i = sqrt; i > 0; i--) {
            if (area % i == 0) {
                result[0] = area / i;
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ConstructtheRectangle492 constructtheRectangle492 = new ConstructtheRectangle492();
        System.out.println(constructtheRectangle492.constructRectangle(4));
    }
}
