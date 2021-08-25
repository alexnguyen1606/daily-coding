package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>5:51 PM ,August 24,2021
 */
public class PathSum_112 {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    if (root.right == null && root.left == null && root.val == targetSum) {
      return true;
    }
    boolean checkLeft = hasPathSum(root.left, targetSum - root.val);
    boolean checkRight = hasPathSum(root.right, targetSum - root.val);
    return checkLeft || checkRight;
  }
}
