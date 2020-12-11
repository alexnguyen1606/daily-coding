package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:19 AM ,December 10,2020
 */
public class BSTIterator {
  private TreeNode root;

  public BSTIterator(TreeNode root) {
    this.root = root;
  }

  public int next() {
    int val = leftMostNode(root);
    if (val != -1) {
      root = deleteNode(root, val);
    }
    return val;
  }

  public boolean hasNext() {
    return root != null;
  }

  private int leftMostNode(TreeNode root) {
    if (root == null) {
      return -1;
    }
    if (root.left == null) {
      return root.val;
    }
    return leftMostNode(root.left);
  }

  private TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return root;
    }
    TreeNode temp = root;
    TreeNode preNode = null;
    while (temp != null) {
      if (temp.val == key) { // current temp is node need delete
        if (temp.right == null && temp.left == null) { // temp is leaf
          if (preNode != null && preNode.val > key) {
            preNode.left = null;
          } else if (preNode != null) {
            preNode.right = null;
          } else {
            root = null;
          }
        } else if (temp.right != null && temp.left != null) { // temp with two node child
          int leftMostNode = leftMostNode(temp.right);
          temp.val = leftMostNode;
          temp.right = deleteNode(temp.right, leftMostNode);
        } else if (temp.right != null) { // temp is internal node with one node child
          if (preNode == null) {
            root = temp.right;
          } else if (preNode.val > key) {
            preNode.left = temp.right;
          } else {
            preNode.right = temp.right;
          }

        } else {
          if (preNode == null) {
            root = temp.left;
          } else if (preNode.val > key) {
            preNode.left = temp.left;
          } else {
            preNode.right = temp.left;
          }
        }
        return root;
      }
      preNode = temp;
      if (temp.val > key) {
        temp = temp.left;
      } else {
        temp = temp.right;
      }
    }

    return root;
  }
}
