package org.phyi.leetcode;

/**
 * ListNode
 * 
 * @author      :	裔传洲
 * @date        :	4/14/17 16:51
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int val) {
		this.val = val;
	}

	public static ListNode create(int[] array) {
		ListNode node = null;
		for (int i : array) {
			node = append(node, i);
		}
		return node;
	}

	private static ListNode append(ListNode node, int n) {
		if (node == null) {
			return new ListNode(n);
		}
		ListNode newnode = new ListNode(n);
		newnode.next = node;
		return newnode;
	}

	@Override
	public String toString() {
		String str = String.valueOf(val);
		ListNode nn = next;
		while (nn != null) {
			str += "," + String.valueOf(nn.val);
			nn = nn.next;
		}
		return str;
	}
}
