package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> bash = new HashMap<>();
        String[] strs = str.split(" ");
        char[] patterns = pattern.toCharArray();
        if (strs.length != patterns.length) return false;
        for (int i = 0; i < patterns.length; i++) {
            if (!bash.containsKey(patterns[i])) {
                bash.put(patterns[i], strs[i]);
            } else {
                if (!bash.get(patterns[i]).equals(strs[i])) return false;
            }
        }
        return true;
    }
}
