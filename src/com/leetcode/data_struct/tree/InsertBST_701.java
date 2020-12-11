package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:30 AM ,December 10,2020
 */
public class InsertBST_701 {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    TreeNode temp = root;
    while (temp != null) {
      if (temp.val == val) {
        return root;
      }
      TreeNode preNode = temp;
      if (temp.val > val) {
        temp = temp.left;
      } else {
        temp = temp.right;
      }
      if (temp == null) {
        if (preNode.val > val) {
          preNode.left = new TreeNode(val);
        } else {
          preNode.right = new TreeNode(val);
        }
        return root;
      }
    }
    return root;
  }
  
}
