package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:34 AM ,November 28,2020
 */
public class SameTree_100 {
  public boolean isSameTree(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    } else if (left == null || right == null) {
      return false;
    }
    return (left.val == right.val)
        && isSameTree(left.left, right.left)
        && isSameTree(left.right, right.right);
  }

  public boolean isSame(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    } else if (left == null || right == null) {
      return false;
    }
    return (left.val == right.val)
        && isSame(left.left, right.left)
        && isSame(left.right, right.right);
  }
}
