package com.leetcode.data_struct.tree.travel;

import com.leetcode.data_struct.tree.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>3:54 PM ,November 30,2020
 */
public class PreorderTraversal_144 {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();
    travel(root, list);
    Collections.reverse(list);
    return list;
  }

  private void travel(TreeNode node, List<Integer> list) {
    if (node == null) {
      return;
    }
    list.add(node.val);
    travel(node.right, list);
    travel(node.left, list);
  
  }
}
