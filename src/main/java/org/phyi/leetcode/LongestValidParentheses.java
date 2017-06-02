package org.phyi.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Longest Valid Parentheses
 * https://leetcode.com/problems/longest-valid-parentheses/#/description
 *
 * @author czhouyi@gmail.com
 * @TODO
 */
public class LongestValidParentheses {
	public static int longestValidParentheses(String s) {
		Stack<Integer> left = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0, len = s.length(); i < len; i++) {
			char c = s.charAt(i);
			if (c == ')' && !left.isEmpty()) {
				left.pop();
			} else {
				if (c == '(') {
					left.push(i);
				} else {
					list.add(i);
				}
			}
		}

		list.addAll(left);
		list.add(0, -1);
		list.add(s.length());

		int maxLen = 0;
		for (int i = 1; i < list.size(); i++) {
			int i1 = list.get(i);
			int i2 = list.get(i - 1);
			if (maxLen < i1 - i2 - 1) {
				maxLen = i1 - i2 - 1;
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("))))))))()(()()((((())))))))))))))))(()()()("));
	}
}