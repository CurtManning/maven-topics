package week3.day3.appcode;

import java.util.Set;

public class SetUtil {

	public static boolean equals(Set<String> set1, Set<String> set2) {

		if (set1 == null || set2 == null) {
			return false;
		}

		if (set1.size() != set2.size()) {
			return false;
		}

		return set1.containsAll(set2);

	}
}