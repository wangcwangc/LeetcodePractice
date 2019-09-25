package practice.leetcode;

public class AvailableCapturesforRook999 {
    public int numRookCaptures(char[][] board) {
        int nums = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'p') {
                nums++;
                break;
            }
            if (board[i][col] == 'B') {
                break;
            }
        }
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][col] == 'p') {
                nums++;
                break;
            }
            if (board[i][col] == 'B') {
                break;
            }
        }
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'p') {
                nums++;
                break;
            }
            if (board[row][i] == 'B') {
                break;
            }
        }
        for (int i = col + 1; i < board[0].length; i++) {
            if (board[row][i] == 'p') {
                nums++;
                break;
            }
            if (board[row][i] == 'B') {
                break;
            }
        }
        return nums;
    }
}
