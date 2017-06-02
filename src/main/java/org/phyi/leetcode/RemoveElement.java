package org.phyi.leetcode;

/**
 * Remove Element
 * https://leetcode.com/problems/remove-element/#/description
 * 
 * @author czhouyi@gmail.com
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int newLength = 0;
		for (int num : nums) {
			if (num != val) {
				nums[newLength] = num;
				newLength ++;
			}
		}
		return newLength;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveElement().removeElement(new int[]{2,3,5,23,4,2,23,4,2}, 2));
	}
}
