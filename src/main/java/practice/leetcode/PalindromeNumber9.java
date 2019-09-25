package practice.leetcode;

public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int result = 0;
        int i = 0;
        while (num != 0) {
            result = result * 10;
            result += num % 10;
            num = num / 10;
            i++;
        }
        if (result == x) return true;
        return false;
    }
}
