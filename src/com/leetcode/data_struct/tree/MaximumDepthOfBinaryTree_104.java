package com.leetcode.data_struct.tree;

public class MaximumDepthOfBinaryTree_104 {

  public int maxDepth(TreeNode root) {
    return lengthOfNode(root,0);
  }

  public int lengthOfNode(TreeNode node, int length) {
    if (node == null) {
      return length;
    }
    int l1 = lengthOfNode(node.left, length + 1);
    int l2 = lengthOfNode(node.right, length + 1);
    return l1 > l2 ? l1 : l2;
  }

  public static void main(String[] args) {}
}
