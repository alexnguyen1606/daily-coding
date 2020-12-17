package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:35 AM ,November 30,2020
 */
public class MinDepthOfBinaryTree_111 {
  public static boolean check = false;

  public int minDepth(TreeNode root) {
    return lengthOfNode(root, 0,false);
  }

  public int lengthOfNode(TreeNode node, int length,boolean check) {
    if (node == null) {
      return length;
    }
    int l1 = lengthOfNode(node.left, length + 1,false);
    int l2 = lengthOfNode(node.right, length + 1,false);
    return l1 > l2 ? l2 : l1;
  }
}
