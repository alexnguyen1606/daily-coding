package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:32 PM ,November 13,2020
 */
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}
 
  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
