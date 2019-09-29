package practice.leetcode;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if (chars.length == 0) return false;
        else if (chars.length == 1) return true;
        else if (chars[0] >= 65 && chars[0] <= 90) {
            if (chars[1] >= 65 && chars[1] <= 90) {
                for (int i = 1; i < chars.length; i++) {
                    if (!((chars[i] >= 65 && chars[i] <= 90))) return false;
                }
            } else {
                for (int i = 1; i < chars.length; i++) {
                    if (!((chars[i] >= 97 && chars[i] <= 122))) return false;
                }
            }
        } else {
            for (int i = 1; i < chars.length; i++) {
                if (!((chars[i] >= 97 && chars[i] <= 122))) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapital520 detectCapital520 = new DetectCapital520();
        System.out.println(detectCapital520.detectCapitalUse("Leetcode"));
    }
}
