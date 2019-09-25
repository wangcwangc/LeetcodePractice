package practice.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount811 {
	public List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> counts = new HashMap<String, Integer>();
		for (String cpdomain : cpdomains) {
			String[] strings = cpdomain.split(" ");
			int num = Integer.parseInt(strings[0]);
			String domain = strings[1];
			String[] domains = domain.split("\\.");
			StringBuffer stringBuffer = new StringBuffer("");
			stringBuffer.append(domains[domains.length - 1]);
			int sub = num;
			if (counts.containsKey(stringBuffer.toString())) {
				sub = num + counts.get(stringBuffer.toString());
			}
			counts.put(domains[domains.length - 1], sub);
			for (int i = domains.length - 2; i >= 0; i--) {
				int size = num;
				stringBuffer = new StringBuffer(domains[i] + ".").append(stringBuffer);
				if (counts.containsKey(stringBuffer.toString())) {
					size = num + counts.get(stringBuffer.toString());
				}
				counts.put(stringBuffer.toString(), size);
			}
		}
		List<String> result = new ArrayList<String>();
		for (String count : counts.keySet()) {
			result.add(counts.get(count) + " " + count);
		}
		return result;
	}
}
