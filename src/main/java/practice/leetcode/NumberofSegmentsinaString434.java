package practice.leetcode;

public class NumberofSegmentsinaString434 {
    public int countSegments(String s) {
        s =s.replaceAll("^\\s*","");
        if (s.length() == 0) return 0;
        return s.split("\\s+").length;
    }

    public static void main(String[] args) {
        NumberofSegmentsinaString434 numberofSegmentsinaString434 = new NumberofSegmentsinaString434();
        System.out.println(numberofSegmentsinaString434.countSegments("                "));
    }
}
