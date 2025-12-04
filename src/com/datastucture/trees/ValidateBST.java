package com.datastucture.trees;

import com.brownbox_online.tree.TreeNode;
//https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!mostRightGreater(root, root.right)) {
            return false;
        }
        if (!mostLeftLower(root, root.left)) {
            return false;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null && left.val >= root.val)
            return false;
        if (right != null && right.val <= root.val)
            return false;
        return isValidBST(root.left) && isValidBST(root.right);

    }

    public boolean mostRightGreater(TreeNode root, TreeNode right) {
        if (right == null) {
            return true;
        }
        if (root.val >= right.val) {
            return false;
        }
        return mostRightGreater(root, right.right)
                && mostRightGreater(root, right.left);
    }

    public boolean mostLeftLower(TreeNode root, TreeNode right) {
        if (right == null) {
            return true;
        }
        if (root.val <= right.val) {
            return false;
        }
        return mostLeftLower(root, right.right)
                && mostLeftLower(root, right.left);
    }

}
