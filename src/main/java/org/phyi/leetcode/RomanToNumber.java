package org.phyi.leetcode;

/**
 * Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/#/description
 *
 * @author czhouyi@gmail.com
 */
public class RomanToNumber {
	public static int romanToInt(String s) {
		int len = s.length();
		char lc = 0;
		int sum = 0;
		for (int i = len; i > 0; i--) {
			char c = s.charAt(i - 1);
			if (c == 'I') {
				if (lc == 'V' || lc == 'X') {
					sum -= 1;
				} else {
					sum += 1;
				}
			} else if (c == 'V') {
				sum += 5;
			} else if (c == 'X') {
				if (lc == 'L' || lc == 'C') {
					sum -= 10;
				} else {
					sum += 10;
				}
			} else if (c == 'L') {
				sum += 50;
			} else if (c == 'C') {
				if (lc == 'D' || lc == 'M') {
					sum -= 100;
				} else {
					sum += 100;
				}
			} else if (c == 'D') {
				sum += 500;
			} else if (c == 'M') {
				sum += 1000;
			}
			lc = c;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCVI"));
	}
}
