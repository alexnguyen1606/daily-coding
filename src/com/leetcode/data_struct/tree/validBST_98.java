package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:45 AM ,December 10,2020
 */
public class validBST_98 {
  public boolean isValidBST(TreeNode root) {
      if (root==null){
          return true;
      }
      if (root.left!=null && root.left.val >= root.val){
          return false;
      }else if(root.left!=null){
          int left = leftMostNode(root);
          int right =rightMostNode(root);
//          return isValidBST(root.left) && right > left
      }
      if (root.right!=null && root.right.val <= root.val){
          return false;
      }
      return isValidBST(root.right) && isValidBST(root.left);
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

  private int rightMostNode(TreeNode root) {
    if (root == null) {
      return -1;
    }
    if (root.left == null) {
      return root.val;
    }
    return rightMostNode(root.left);
  }
}
