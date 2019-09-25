package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger13 {
    static Map<String, Integer> bash = new HashMap<>();

    static {
        bash.put("I", 1);
        bash.put("V", 5);
        bash.put("X", 10);
        bash.put("L", 50);
        bash.put("C", 100);
        bash.put("D", 500);
        bash.put("M", 1000);
        bash.put("Q", 4);
        bash.put("W", 9);
        bash.put("E", 40);
        bash.put("R", 90);
        bash.put("T", 400);
        bash.put("Y", 900);
    }

    public int romanToInt(String s) {
        int result = 0;
        s = s.replaceAll("IV", "Q")
                .replaceAll("IX", "W")
                .replaceAll("XL", "E")
                .replaceAll("XC", "R")
                .replaceAll("CD", "T")
                .replaceAll("CM", "Y");
        for (char c : s.toCharArray()) {
            result = result + bash.get(c + "");
        }
        return result;
    }
}
