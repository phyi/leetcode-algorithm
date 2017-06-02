package org.phyi.leetcode;

/**
 * Reverse Integer
 * https://leetcode.com/problems/reverse-integer/#/description
 *
 * @author czhouyi@gmail.com
 */
public class ReverseInteger {
	public static int reverse(int x) {
		long rs = 0;
		while (x != 0) {
			rs = rs * 10 + x % 10;
			x = x / 10;
		}
		if (x < 0) {
			rs = rs * -1;
		}
		if (rs > Integer.MAX_VALUE || rs < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) rs;
	}

	public static void main(String[] args) {
		System.out.println(reverse(483648));
	}
}
