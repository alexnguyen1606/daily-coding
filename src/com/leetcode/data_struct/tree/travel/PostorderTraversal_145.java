package com.leetcode.data_struct.tree.travel;

import com.leetcode.data_struct.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:34 AM ,December 11,2020
 */
public class PostorderTraversal_145 {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();
    dfs(root, list);
    return list;
  }

  private void dfs(TreeNode node, List<Integer> list) {
    if (node == null) {
      return;
    }
    dfs(node.left, list);
    dfs(node.right, list);
    list.add(node.val);
  }

  public static void main(String[] args) {
    int x = 1;
    x^=2;
//    x^=3;
    
    System.out.println(x);
  }
}
