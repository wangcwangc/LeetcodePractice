package practice.leetcode;

import java.util.HashSet;

public class FindtheTownJudge997 {
    public int findJudge(int N, int[][] trust) {
        if (trust == null) {
            return -1;
        }
        HashSet<Integer> judges = new HashSet<Integer>(N);
        HashSet<Integer> noJudges = new HashSet<Integer>(N);
        int row = trust.length;
        for (int i = 0; i < row; i++) {
            if (judges.contains(trust[i][0])) {
                judges.remove(trust[i][0]);
            }
            noJudges.add(trust[i][0]);
            if (!noJudges.contains(trust[i][1])) {
                judges.add(trust[i][1]);
            }
        }
        if (judges.size() == 1) return judges.toArray(new Integer[]{})[0];
        return -1;
    }
}
