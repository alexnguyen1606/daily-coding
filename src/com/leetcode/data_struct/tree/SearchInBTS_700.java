package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:27 AM ,December 10,2020
 */
public class SearchInBTS_700 {

  // with recursive
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (root.val == val) {
      return root;
    } else if (root.val > val) {
      return searchBST(root.left, val);
    } else {
      return searchBST(root.right, val);
    }
  }

  // without recursive
  public TreeNode searchBSTWithoutRecursive(TreeNode root, int val) {

    if (root == null) {
      return null;
    }
    TreeNode temp = root;
    while (temp != null) {
      if (temp.val == val) {
        return temp;
      }
      if (temp.val > val) {
        temp = temp.left;
      } else if (temp.val < val) {
        temp = temp.right;
      }
    }
    return null;
  }
}
