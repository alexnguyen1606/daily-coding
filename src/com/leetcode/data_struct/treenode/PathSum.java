package com.leetcode.data_struct.treenode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:33 AM ,November 30,2020
 */
public class PathSum {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left==null && root.right==null && root.val == sum){
      return true;
    }
    boolean bl1 = hasPathSum(root.left, sum - root.val);
    boolean bl2 = hasPathSum(root.right, sum- root.val);
    return bl1 || bl2;
  }
  
  public static void main(String[] args) {
      TreeNode treeNode = new TreeNode(1);
      treeNode.left = new TreeNode(2);
      PathSum pathSum = new PathSum();
    System.out.println(pathSum.hasPathSum(treeNode,1));
  }
}
