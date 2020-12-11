package com.leetcode.data_struct.tree;

import com.leetcode.data_struct.linkedlist.ListNode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:40 AM ,December 04,2020
 */
public class ConvertSortedListToBTS_109 {
  public TreeNode sortedListToBST(ListNode head) {
    int[] arraySorted = listToArray(head);
    return dive(arraySorted, 0, arraySorted.length - 1);
  }

  private TreeNode dive(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    int middle = start + (end - start) / 2;
    TreeNode treeNode = new TreeNode(nums[middle]);
    if (start == end) {
      return treeNode;
    }
    treeNode.left = dive(nums, start, middle - 1);
    treeNode.right = dive(nums, middle + 1, end);
    return treeNode;
  }

  private int[] listToArray(ListNode head) {
    int i = 0;
    ListNode current = head;
    while (current != null) {
      i++;
      current = current.next;
    }
    current = head;
    int[] array = new int[i + 1];
    i = 0;
    while (current != null) {
      array[i] = current.val;
      i++;
      current = current.next;
    }
    return array;
  }
}
