package practice.leetcode;

public class BuddyStrings859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        char a = ' ';
        char b = ' ';
        int num = 0;
        boolean result = false;
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == charB[i]) continue;
            else {
                num++;
                if (a == ' ' && b == ' ') {
                    a = charA[i];
                    b = charB[i];
                } else if (b == charA[i] && a == charB[i]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        if (num == 2 && result) return true;
        else return false;
    }

    public static void main(String[] args) {
        BuddyStrings859 buddyStrings859 = new BuddyStrings859();
        System.out.println(buddyStrings859.buddyStrings("aa", "aa"));
    }
}
