package com.leetcode.data_struct.treenode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:36 AM ,December 04,2020
 */
public class IncreaseOrderBST_897 {
  public TreeNode increasingBST(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode treeNode = stack.pop();
      list.add(treeNode.val);
      if (treeNode.left != null) {
        stack.push(treeNode.left);
      }
      if (treeNode.right != null) {
        stack.push(treeNode.right);
      }
    }
    Collections.sort(list);
    TreeNode treeNode = new TreeNode();
    buildTree(treeNode, 0, list);
    return treeNode.right;
  }

  private void buildTree(TreeNode treeNode, int i, List<Integer> list) {
    if (i < list.size()) {
      treeNode.right = new TreeNode(list.get(i));
      buildTree(treeNode.right, ++i, list);
    }
  }
}
