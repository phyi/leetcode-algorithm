package org.phyi.leetcode;

/**
 * Palindrome Number
 * https://leetcode.com/problems/palindrome-number/#/description
 *
 * @author czhouyi@gmail.com
 */
public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int y = x;
		long rs = 0;
		while (y != 0) {
			rs = rs * 10 + y % 10;
			y = y / 10;
		}
//		if (rs > Integer.MAX_VALUE || rs < Integer.MIN_VALUE) {
//			return false;
//		}
		return rs == x;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(-2147447412));
	}
}
