package practice.leetcode;

public class FibonacciNumber509 {
	public int fib(int N) {
		System.out.println(ArrayPartitionI561.path);
		if (N <= 1)
			return N;
		else {
			return fib(N - 2) + fib(N - 1);
		}
	}
}
