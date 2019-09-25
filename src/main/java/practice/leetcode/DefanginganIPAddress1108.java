package practice.leetcode;

public class DefanginganIPAddress1108 {
    public String defangIPaddr(String address) {
        String[] results = address.split("\\.");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(results[0]);
        for (int i = 1; i < results.length; i++) {
            stringBuffer.append("[.]");
            stringBuffer.append(results[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        DefanginganIPAddress1108 defanginganIPAddress1108 = new DefanginganIPAddress1108();
        System.out.println(defanginganIPAddress1108.defangIPaddr("255.1.1.1"));
    }
}
