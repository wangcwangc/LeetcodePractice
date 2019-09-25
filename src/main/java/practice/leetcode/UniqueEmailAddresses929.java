package practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
	public int numUniqueEmails(String[] emails) {
		Set<String> emailSet = new HashSet<String>(256);
		for (String email : emails) {
			String[] emailName = email.split("@");
			String name = emailName[0];
			String address = emailName[1];
			name = name.split("\\+")[0];
			name = name.replace(".", "");
			emailSet.add(name + "@" + address);
		}
		return emailSet.size();
	}
}
