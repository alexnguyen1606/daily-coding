package com.leetcode.data_struct.treenode;

public class BalancedBinaryTree_110 {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    int l1 = 1;
    if (root.left != null) {
      l1 = lengthOfNode(root.left, 1);
    }
    int l2 = 1;
    if (root.right != null) {
      l2 = lengthOfNode(root.right, 1);
    }
    int x = l2 - l1 > 0 ? l2 - l1 : (l2 - l1) * (-1);
    return x <= 1;
  }

  public int lengthOfNode(TreeNode node, int length) {
    if (node.left == null && node.right == null) {
      return length;
    }if (node.right!=null && node.left!=null){
      
      }
    int l1 = lengthOfNode(node.left, length + 1);
    int l2 = lengthOfNode(node.right, length + 1);
    return l1 > l2 ? l1 : l2;
  }
}
