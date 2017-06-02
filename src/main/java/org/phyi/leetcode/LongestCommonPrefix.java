package org.phyi.leetcode;

/**
 * LongestCommonPrefix
 * https://leetcode.com/problems/longest-common-prefix/#/description
 *
 * @author czhouyi@gmail.com
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		int len = strs.length;
		if (len == 0) {
			return "";
		}
		if (len == 1) {
			return strs[0];
		}
		int mid = (len % 2 == 0) ? len / 2 : (len + 1) / 2;
		String[] str1 = new String[mid];
		String[] str2 = new String[len - mid];
		for (int i = 0; i < len; i++) {
			if (i < mid) {
				str1[i] = strs[i];
			} else {
				str2[i - mid] = strs[i];
			}
		}

		String comm1 = longestCommonPrefix(str1);
		String comm2 = longestCommonPrefix(str2);

		int sl = Math.min(comm1.length(), comm2.length());

		for (int i = 0; i < sl; i++) {
			if (comm1.charAt(i) != comm2.charAt(i)) {
				return comm1.substring(0, i);
			}
		}
		return comm1.substring(0, sl);
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"abdef", "abiji"}));
	}

}
