package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:13 PM ,August 23,2021
 */
public class ValidateBinarySearchTree_98 {
  public static boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    if (left != null && left.val >= root.val) {
      return false;
    }
    if (right != null && right.val <= root.val) {
      return false;
    }
    return isValidBST(right) && isValidBST(left);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(6);
    root.left = left1;
    root.right= right1;
	  TreeNode left2 = new TreeNode(3);
	  TreeNode right2 = new TreeNode(7);
	  right1.left = left2;
	  right1.right = right2;
    System.out.println(isValidBST(root));
  }
}
