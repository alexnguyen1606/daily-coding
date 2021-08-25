package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>5:32 PM ,August 24,2021
 */
public class MaximumDepthBinaryTree_104 {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftLength = maxDepth(root.left)+1;
    int rightLength = maxDepth(root.right)+1;
    return leftLength > rightLength ? leftLength : rightLength;
  }
}
