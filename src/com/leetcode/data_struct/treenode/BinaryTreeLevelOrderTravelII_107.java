package com.leetcode.data_struct.treenode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:06 AM ,November 30,2020
 */
public class BinaryTreeLevelOrderTravelII_107 {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> listOfList = new LinkedList<>();
    if (root == null) {
      return listOfList;
    }
      Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.empty()){
        TreeNode treeNode = stack.pop();
        if (treeNode.left!= null){
            stack.push(treeNode.left);
        }
        if (treeNode.right!= null){
            stack.push(treeNode.right);
        }
    }
    List<Integer> rootList = new LinkedList<>();
    getList(root, rootList);
    listOfList.add(rootList);
    return listOfList;
  }

  public void getList(TreeNode node, List<Integer> list) {
    if (node == null) {
      return;
    }
    list.add(node.val);
    getList(node.left, list);
    getList(node.right, list);
  }

  public void travel(List<List<Integer>> list, TreeNode node) {
    if (node == null) {
      return;
    }
    List<Integer> listNode = new ArrayList<>(2);
    if (node.left != null) {
      listNode.add(node.left.val);
    }
    if (node.right != null) {
      listNode.add(node.right.val);
    }
    if (listNode.size() > 0) {
      list.add(listNode);
    }
    travel(list, node.left);
    travel(list, node.right);
  }

  public void travel2(List<Integer> list, TreeNode node) {
    if (node.right == null && node.left == null) {
      list.add(node.val);
      return;
    }
    if (node.left != null) {
      travel2(list, node.left);
    }

    if (node.right != null) {
      travel2(list, node.right);
    }
  }
}
