package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean flag = true;
            if (String.valueOf(i).contains("0"))
                continue;
            int num = i;
            while (num % 10 != 0) {
                int div = num % 10;
                num = num / 10;
                if (i % div != 0) flag = false;
            }
            if (flag) result.add(i);
        }
        return result;
    }
}
