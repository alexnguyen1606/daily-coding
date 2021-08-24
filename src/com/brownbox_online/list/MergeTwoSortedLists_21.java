package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 *     <p>1:54 PM ,August 23,2021
 */
public class MergeTwoSortedLists_21 {
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

  public ListNode recursion(ListNode l1, ListNode l2) {
  	
  	return null;
  }
}
