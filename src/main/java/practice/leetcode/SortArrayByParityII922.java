package practice.leetcode;

public class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int odd = 1;
        int even = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[even] = A[i];
                even = even + 2;
            } else {
                result[odd] = A[i];
                odd = odd + 2;
            }
        }
        return result;
    }
}
