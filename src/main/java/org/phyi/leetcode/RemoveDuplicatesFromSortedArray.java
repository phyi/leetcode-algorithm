package org.phyi.leetcode;

/**
 * Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 * 
 * @author czhouyi@gmail.com
 */
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int newLength = 1;
		int current = nums[0];
		for (int num : nums) {
			if (current != num) {
				newLength ++;
				nums[newLength-1]=num;
				current = num;
			}
		}
		return newLength;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,3,4,5,6,6,6,6}));
	}
}
