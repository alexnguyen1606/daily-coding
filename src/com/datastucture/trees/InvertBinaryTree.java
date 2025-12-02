package com.datastucture.trees;

import com.brownbox_online.tree.TreeNode;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
