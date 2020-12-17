package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:31 PM ,December 16,2020
 */
public class SumOfLeftLeaves_404 {
  public int sumOfLeftLeaves(TreeNode root) {
    return sumOfLeftLeaf(root, false);
  }
  // use recursive
  private int sumOfLeftLeaf(TreeNode root, boolean preNode) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null && preNode) {
      return root.val;
    }

    return sumOfLeftLeaf(root.left, true) + sumOfLeftLeaf(root.right, false);
  }

  private int sumOfRightLeaf(TreeNode treeNode, boolean check) {
    if (treeNode == null) {
      return 0;
    }
    if (treeNode.right == null && treeNode.left == null) {
      return treeNode.val;
    }
    return sumOfRightLeaf(treeNode.right, true) + sumOfRightLeaf(treeNode.left, false);
  }
}
