package practice.leetcode;

public class MaximumNumberofBalloons1189 {

    public int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        String t = balloon;
        int num = 0;
        for (char c : text.toCharArray()) {
            t = t.replace(c, '1');
            if (t.equals("1111111")) {
                num++;
                t = balloon;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        MaximumNumberofBalloons1189 maximumNumberofBalloons1189 = new MaximumNumberofBalloons1189();
        System.out.println(maximumNumberofBalloons1189.maxNumberOfBalloons("balon"));
    }
}
