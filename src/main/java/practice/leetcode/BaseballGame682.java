package practice.leetcode;

public class BaseballGame682 {
	public int calPoints(String[] ops) {
		int length = ops.length;
		int[] points = new int[length];
		int index = 0;
		for (String op : ops) {
			switch (op) {
			case "C":
				index--;
				points[index] = 0;
				break;
			case "D":
				points[index] = points[index - 1] * 2;
				index++;
				break;
			case "+":
				points[index] = points[index - 1] + points[index - 2];
				index++;
				break;
			default:
				int point = Integer.parseInt(op);
				points[index] = point;
				index++;
				break;
			}
		}
		int sum = 0;
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
}
