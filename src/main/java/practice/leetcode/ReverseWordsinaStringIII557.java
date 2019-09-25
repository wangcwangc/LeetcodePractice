package practice.leetcode;

public class ReverseWordsinaStringIII557 {
    public String reverseWords(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] sArray = s.split(" ");
        for (String string : sArray) {
            char[] charArray = string.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                stringBuffer.append(charArray[i]);
            }
            stringBuffer.append(" ");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }
}
