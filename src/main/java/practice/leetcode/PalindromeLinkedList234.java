package practice.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int length = list.size();
        if (length == 1) return true;
        int halfLength = length / 2;
        if (length % 2 == 0) {
            for (int i = 0; i < length; i++) {
                if (i >= halfLength) {
                    if (!stack.pop().equals(list.get(i))) return false;
                } else {
                    stack.push(list.get(i));
                }
            }
        } else {
            halfLength++;
            for (int i = 0; i < length; i++) {
                if (i > halfLength) {
                    if (!stack.pop().equals(list.get(i))) return false;
                } else if (i == halfLength) {
                    stack.pop();
                    if (!stack.pop().equals(list.get(i))) return false;
                } else {
                    stack.push(list.get(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        PalindromeLinkedList234 palindromeLinkedList234 = new PalindromeLinkedList234();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}