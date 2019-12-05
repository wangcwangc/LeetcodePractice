package practice.leetcode;

public class GuessNumbersLCP1 {
    public int game(int[] guess, int[] answer) {
        int num = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) num++;
        }
        return num;
    }
}
