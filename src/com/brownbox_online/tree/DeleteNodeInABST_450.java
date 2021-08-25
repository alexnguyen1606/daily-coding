package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:34 PM ,August 23,2021
 */
public class DeleteNodeInABST_450 {

  // Xóa node gồm 2 bước
  // B1 : xác định node
  // B2 : Xóa node
  // Xóa node có 2 TH
  // TH1 : Node là node lá
  // Th2 : Node có 1 node lá
  // TH3 : Node có 2 node lá

  public TreeNode deleteNode(TreeNode root, int key) {
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

  // return node trái cùng
  public TreeNode leftMostNode(TreeNode root) {
    if (root.left == null) {
      return root;
    }
    return leftMostNode(root.left);
  }

  // return node phải cùng cùng
  public TreeNode rightMostNode(TreeNode root) {
    if (root.right == null) {
      return root;
    }
    return rightMostNode(root.right);
  }
}
