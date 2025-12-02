package com.datastucture.trees;

import com.brownbox_online.tree.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/description/
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int hLeft = height(root.left);
        int hRight = height(root.right);
        int delta = hLeft > hRight ? hLeft - hRight : hRight - hLeft;
        if (delta > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left) + 1;
        int right = height(root.right) + 1;
        return Math.max(left, right);
    }

}
