package practice.leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if(a < b + c){
                return a + b + c;
            }
        }
        return 0;
    }

}
