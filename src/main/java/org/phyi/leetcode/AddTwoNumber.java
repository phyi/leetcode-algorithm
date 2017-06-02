package org.phyi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * AddTwoNumber
 * https://leetcode.com/problems/add-two-numbers/#/description
 *
 * @author czhouyi@gmail.com
 */
public class AddTwoNumber {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		List<Integer> list = new ArrayList<Integer>();
		ListNode node = null;
		int promt = 0;
		while (l1 != null || l2 != null) {
			int n = promt;
			promt = 0;
			if (l1 != null) {
				n += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				n += l2.val;
				l2 = l2.next;
			}
			if (n >= 10) {
				n = n % 10;
				promt = 1;
			}
			list.add(n);
		}
		if (promt == 1) {
			list.add(1);
		}
		for (int i = list.size(); i > 0; i--) {
			node = append(node, list.get(i - 1));
		}
		return node;
	}

	private ListNode append(ListNode node, int n) {
		if (node == null) {
			return new ListNode(n);
		}
		ListNode newnode = new ListNode(n);
		newnode.next = node;
		return newnode;
	}

	public static void main(String[] args) {
		AddTwoNumber atn = new AddTwoNumber();
		ListNode l1 = ListNode.create(new int[]{2, 4, 3});
		ListNode l2 = ListNode.create(new int[]{5, 6, 4});
		ListNode l = atn.addTwoNumbers(l1, l2);
		System.out.println(l);
	}
}
