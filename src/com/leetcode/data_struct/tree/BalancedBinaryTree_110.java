package com.leetcode.data_struct.tree;

import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree_110 {
  public boolean isBalanced(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    dfsInorder(root, list);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i - 1) > list.get(i)) {
        return false;
      }
    }
    return true;
  }

  public int lengthOfNode(TreeNode node, int length) {
    if (node.left == null && node.right == null) {
      return length;
    }
    if (node.right != null && node.left != null) {}

    int l1 = lengthOfNode(node.left, length + 1);
    int l2 = lengthOfNode(node.right, length + 1);
    return l1 > l2 ? l1 : l2;
  }

  private void dfsInorder(TreeNode treeNode, List<Integer> list) {
    if (treeNode == null) {
      return;
    }
    dfsInorder(treeNode.left, list);
    list.add(treeNode.val);
    dfsInorder(treeNode.right, list);
  }
}
