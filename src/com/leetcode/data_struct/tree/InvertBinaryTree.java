package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>11:20 AM ,November 30,2020
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
