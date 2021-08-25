package com.brownbox_online.list;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:54 PM ,August 24,2021
 */
public class MergeKSortedLists_23 {
	
	//Độ phức tạp O(n^2)
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists==null){
			return null;
		}
		ListNode result = new ListNode();
		for (int i = 0;i<lists.length;i++){
			if (i==0){
				result = mergeTwoLists(result.next,lists[i]);
			}else {
				result = mergeTwoLists(result,lists[i]);
			}
		}
		return result;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode listNode=new ListNode();
		ListNode currentNode = listNode;
		while (l1!=null || l2!=null){
			if (l1!=null && l2!=null){
				if (l1.val <= l2.val){
					currentNode.next = l1;
					l1 = l1.next;
				}else{
					currentNode.next = l2;
					l2 = l2.next;
				}
			}else if (l1!=null){
				currentNode.next = l1;
				break;
			}else {
				currentNode.next = l2;
				break;
			}
			currentNode = currentNode.next;
		}
		return listNode.next;
	}
	
	// Độ phức tạp O(n*logn)
	//
	public ListNode mergeKSortedList(ListNode[] lists){
		List<ListNode> result = Arrays.asList(lists);
		List<ListNode> temp;
		while (result.size()==1){
			temp = new ArrayList<>(result.size()/2);
			for (int i = 0;i<result.size();i+=2){
				ListNode l1 = result.get(i);
				ListNode l2 = (i+1)<result.size()? result.get(i+1):null;
				ListNode merged = mergeTwoLists(l1,l2);
				temp.add(merged);
			}
			result = temp;
		}
		if (result.size()==0){
			return null;
		}
		return result.get(0);
	}
	
	// Độ phức tạp O(n*logn)
	// Sử dụng priority queue
	public ListNode mergeKSortedListByPriorityQueue(ListNode[] lists){
		PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
		for (ListNode node : lists){
			if (node!=null){
				priorityQueue.add(node);
			}
		}
		ListNode head = null;
		ListNode currentNode = null;
		ListNode nextNode = null;
		ListNode lastNode = null;
		while (!priorityQueue.isEmpty()){
			currentNode = priorityQueue.poll();
			if (head == null){
				head = currentNode;
			}else {
				lastNode.next = currentNode;
			}
			nextNode = currentNode.next;
			if (nextNode!=null){
				priorityQueue.add(nextNode);
			}
			lastNode = currentNode;
		}
		return head;
	}
}
