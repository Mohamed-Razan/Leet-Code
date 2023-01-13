package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedLinkedList {

	public static void main(String[] args) {

		ListNode a = new ListNode(4, null);
		ListNode b = new ListNode(2, a);
		ListNode l1 = new ListNode(1, b);

		ListNode m = new ListNode(4, null);
		ListNode n = new ListNode(3, m);
		ListNode l2 = new ListNode(1, n);

		mergeTwoLists(l1, l2);

	}

//	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		
//		ListNode current1 = list1;
//		ListNode current2 = list2;
//		
//		List<Integer> list1List = new ArrayList<>();
//		List<Integer> list2List = new ArrayList<>();
//		
//		List<ListNode> listNodes = new ArrayList<>();
//		
//		while(current1 != null) {
//			list1List.add(current1.val);
//			current1 = current1.next;
//			
//		}
//		
//		while(current2 != null) {
//			list2List.add(current2.val);
//			current2 = current2.next;
//			
//		}
//		
//		list1List.addAll(list2List);
//		
//		list1List = list1List.stream().sorted().collect(Collectors.toList()); 
//		
//		System.out.println(list1List);
//		
//		ListNode prev = null;
//		for(int i = list1List.size() - 1; i >= 0; i--) {
//			ListNode listNode = new ListNode(list1List.get(i), prev);
//			prev = listNode;
//		}
//		
//		return prev;
//
//	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		while(list1 != null && list2 != null) {
			
			if(list1.val < list2.val) {
				ListNode list1Next = list1.next;
				list1.next = list2;
				System.out.println(list1.val);
				
				mergeTwoLists(list2, list1Next);
			}
			
			else {
				ListNode list2Next = list2.next;
				list2.next = list1;
				
				mergeTwoLists(list1, list2Next);
			}
		}
		
		return null;

	}
}
