package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:17 PM ,December 11,2020
 */
public class ConstructBSTFromPreorderTraversal_1008 {
  public TreeNode bstFromPreorder(int[] preorder) {
    
  
    return convertToBST(preorder,0,preorder.length-1);
  }

  private void sortArray(int[] nums) {
    int n = nums.length;
    for (int i = 1; i < n; i++) {
      int MAX = nums[i];
      int j = i - 1;
      while (j >= 0 && nums[j] > MAX) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = MAX;
    }
  }

  private TreeNode convertToBST(int[] array, int start, int end) {
    if (start > end) {
      return null;
    }
    int middle = start + (end - start) / 2;
    TreeNode treeNode = new TreeNode(array[middle]);
    if (start == end) {
      return treeNode;
    }
    treeNode.left = convertToBST(array, start, middle - 1);
    treeNode.right = convertToBST(array, middle + 1, end);
    return treeNode;
  }

  public void construct(TreeNode root, int[] preorder, int i, int end) {
    if (i >= end) {
      return;
    }
    TreeNode treeNode = new TreeNode(preorder[i]);
    if (root.val > treeNode.val) {
      root.left = treeNode;
      construct(root.left, preorder, i + 1, end);
    } else {
      root.right = treeNode;
      construct(root.right, preorder, i + 1, end);
    }
  }
}
