package com.leetcode.data_struct.treenode;

/**
 * @author:Nguyen Anh Tuan
 *     <p>8:19 AM ,November 28,2020
 */
public class SymmetricTree_101 {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isMirror2(root.left, root.right);
  }

  public boolean isMirror(TreeNode left, TreeNode right) {
    if (right == null && left == null) {
      return true;
    }
    if (right == null || left == null) {
      return false;
    }
    return (left.val == right.val)
        && isMirror(left.left, right.right)
        && isMirror(left.right, right.left);
  }

  public boolean isMirror2(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return (t1.val == t2.val) && isMirror2(t1.right, t2.left) && isMirror2(t1.left, t2.right);
  }

  public Integer sumTree(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return root.val + sumTree(root.left) + sumTree(root.right);
  }

  public static void main(String[] args) {
      SymmetricTree_101 symmetricTree = new SymmetricTree_101();
      TreeNode treeNode = new TreeNode();
      treeNode.left = new TreeNode(1) ;
      treeNode.left.left = new TreeNode(3);
      treeNode.left.right = new TreeNode(4);
      treeNode.right = new TreeNode(2) ;
    System.out.println(symmetricTree.sumTree(treeNode));
  }
}
