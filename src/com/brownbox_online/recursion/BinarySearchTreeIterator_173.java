package com.brownbox_online.recursion;

import com.brownbox_online.tree.TreeNode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:15 PM ,October 02,2021
 */
public class BinarySearchTreeIterator_173 {
  public static class BSTIterator {

    private TreeNode root;

    public BSTIterator(TreeNode root) {
      this.root = root;
    }

    // Return min value if exits
    public int next() {
      if (!hasNext()) {
        return -1;
      }
      int value = leftMostNode(root).val;
      root = deleteNode(root, value);
      return value;
    }

    private TreeNode deleteNode(TreeNode root, int key) {
      if (root == null) {
        return root;
      }
      if (root.val > key) {
        root.left = deleteNode(root.left, key);
      } else if (root.val < key) {
        root.right = deleteNode(root.right, key);
      } else {
        // TH 1
        if (root.left == null && root.right == null) {
          return null;
        }

        // TH2
        if (root.left != null && root.right == null) {
          return root.left;
        }
        if (root.left == null && root.right != null) {
          return root.right;
        }
        // TH3
        TreeNode leftMostNode = leftMostNode(root.right);
        root.val = leftMostNode.val;
        root.right = deleteNode(root.right, root.val);
      }
      return root;
    }

    public boolean hasNext() {
      if (root == null) {
        return false;
      }
      return true;
    }

    private TreeNode leftMostNode(TreeNode node) {
      if (node.left == null) {
        return node;
      }
      return leftMostNode(node.left);
    }
  }
}
