package com.leetcode.data_struct.treenode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>5:04 PM ,December 03,2020
 */
public class ConvertSortedArrayToBST_108 {
  public TreeNode sortedArrayToBST(int[] nums) {
    return dive(nums, 0, nums.length - 1);
  }

  private TreeNode dive(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    int middle = start+ (end - start) / 2;
    TreeNode treeNode = new TreeNode(nums[middle]);
    if (start == end) {
      return treeNode;
    }
    treeNode.left = dive(nums, start, middle - 1);
    treeNode.right = dive(nums, middle + 1, end);
    return treeNode;
  }

  public boolean searchBST(TreeNode node, int target) {
    if (node != null) {
      if (node.val == target) {
        System.out.println("Tìm thấy target");
        return true;
      }
      return node.val > target ? searchBST(node.left, target) : searchBST(node.right, target);
    }
    return false;
  }
}
