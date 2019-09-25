package practice.leetcode;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            carry = false;
            digits[i] = digits[i] + 1;
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 10;
                carry = true;
                if (i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    for (int j = digits.length - 1; j >= 0; j--) {
                        newDigits[j] = digits[j];
                    }
                    newDigits[0] = 1;
                    return newDigits;
                }
            }
            if (!carry) break;
        }
        return digits;
    }
}
