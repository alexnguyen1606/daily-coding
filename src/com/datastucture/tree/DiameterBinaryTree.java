package com.datastucture.tree;

import com.brownbox_online.tree.TreeNode;

//https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) + height(root.right);
    }


    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left) + 1;
        int right = height(root.right) + 1;
        return Math.max(right, left);
    }

}
