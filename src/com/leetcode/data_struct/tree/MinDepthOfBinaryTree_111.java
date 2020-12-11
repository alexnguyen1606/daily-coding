package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:35 AM ,November 30,2020
 */
public class MinDepthOfBinaryTree_111 {
  public static boolean check = false;

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    } else if (root.right != null && root.left != null) {
      int l1 = minDepth(root.left);
      int l2 = minDepth(root.right);
      return l1 > l2 ? l2 : l1;
    } else if (root.right != null) {
      return 1 + minDepth(root.right);
    } else {
      return 1 + minDepth(root.left);
    }
  }

  public int lengthOfNode(TreeNode node, int length) {
    if (node == null) {
      return length;
    }
    if (node.left == null && node.right == null) {
      return length;
    }
    int l1 = lengthOfNode(node.left, length + 1);
    int l2 = lengthOfNode(node.right, length + 1);
    return l1 > l2 ? l1 : l2;
  }
}
