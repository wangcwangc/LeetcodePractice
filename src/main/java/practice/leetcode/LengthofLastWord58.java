package practice.leetcode;

public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) return 0;
        return strings[strings.length - 1].length();
    }

    public static void main(String[] args) {
        LengthofLastWord58 lengthofLastWord58 = new LengthofLastWord58();
        System.out.println(lengthofLastWord58.lengthOfLastWord(" "));
    }
}
