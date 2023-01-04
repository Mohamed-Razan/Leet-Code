package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListSum {

	public static void main(String args[]) {
		
		ListNode a = new ListNode(3, null);
		ListNode b = new ListNode(4, a);
		ListNode l1 = new ListNode(2, b);
		
		ListNode m = new ListNode(4, null);
		ListNode n = new ListNode(6, m);
		ListNode l2 = new ListNode(5, n);
		
		List<ListNode> listNodes = addTwoNumbers(l1, l2);
		
		for(int i = 0; i < listNodes.size(); i++) {
			System.out.println(listNodes.get(i).val);
		}

	}

	public static List<ListNode> addTwoNumbers(ListNode l1, ListNode l2) {

		int i;
		
		ListNode current1 = l1;
		ListNode current2 = l2;
		
		ListNode current = null;
		ListNode prev = null;
		
		int times = 0;
		int bal = 0;
		
		List<ListNode> listNodes = new ArrayList<>();
		
		while(current1 != null && current2 != null) {
			
			times = (current1.val + current2.val + times)/10;
			bal = (current1.val + current2.val + times)%10;
			System.out.println(times);
			System.out.println(bal);
			System.out.println();
			
			prev = current;
			current = new ListNode(bal, prev);
			listNodes.add(current);
			
			current1 = current1.next;
			current2 = current1.next;
		}
		
		return listNodes;
		
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
