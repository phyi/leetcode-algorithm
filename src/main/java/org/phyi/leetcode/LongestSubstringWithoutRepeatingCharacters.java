package org.phyi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
 *
 * @author czhouyi@gmail.com
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int len = s.length();
		int max = 0;
		int curr = 0;
		int breakIndex = -1;
		for (int i = 0; i < len; i++) {
			Character c = s.charAt(i);
			if (map.containsKey(c)) {
				int lastIndex = map.get(c);
				if (breakIndex != -1 && breakIndex > lastIndex) {
					curr = i - breakIndex;
				} else {
					curr = i - lastIndex;
					breakIndex = lastIndex;
				}
			} else {
				curr++;
			}
			map.put(c, i);
			if (curr > max) {
				max = curr;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abba"));
	}
}
