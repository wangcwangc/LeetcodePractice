package practice.leetcode;

public class NumberofLinesToWriteString806 {
    public int[] numberOfLines(int[] widths, String S) {
        int[] num = new int[2];
        int result = 0;
        for (char c : S.toCharArray()) {
            result = result + widths[c - 97];
        }
        if (result == 0) {
            num[0] = 0;
            num[1] = 0;
        } else if (result % 100 != 0) {
            num[0] = result / 100 + 1;
            num[1] = result % 100;
        } else {
            num[0] = result / 100;
            num[1] = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        NumberofLinesToWriteString806 numberofLinesToWriteString806 = new NumberofLinesToWriteString806();
        numberofLinesToWriteString806.numberOfLines(null, "aaa");
    }
}
