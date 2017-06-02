package org.phyi.leetcode;

/**
 * Divide Two Integers
 * https://leetcode.com/problems/divide-two-integers/#/description
 * @TODO
 *
 * @author czhouyi@gmail.com
 */
public class DivideTwoIntegers {
	public static int divide(int dividend, int divisor) {
		int rs = 1;
		int carry = divisor;
		while (carry < dividend) {
			carry += carry;
			rs += rs;
		}
		while (carry > dividend) {
			carry -= divisor;
			rs -= 1;
		}
		return rs;
	}

	public static void main(String[] args) {
		System.out.println(divide(44, 3));
	}
}
