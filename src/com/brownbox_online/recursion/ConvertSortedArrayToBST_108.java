package com.brownbox_online.recursion;

import com.brownbox_online.tree.TreeNode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:45 PM ,October 02,2021
 */
public class ConvertSortedArrayToBST_108 {
  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length);
  }

  public TreeNode sortedArrayToBST(int[] nums, int L, int R) {
    if (L > R) {
      return null;
    }
    int middle = (L + R) / 2;
    if (middle < 0 || middle >= nums.length) {
      return null;
    }
    TreeNode treeNode = new TreeNode(nums[middle]);
    treeNode.left = sortedArrayToBST(nums, L, middle - 1);
    treeNode.right = sortedArrayToBST(nums, middle + 1, R);
    return treeNode;
  }
}
