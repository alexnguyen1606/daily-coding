package com.leetcode.data_struct.tree;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/29/2023
 */

public class BinaryTreeMaximumPathSum_124 {

    public static int maxPathSum(TreeNode root) {

        return travel(root);
    }

    //fail
    private static int travel(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftValue = travel(node.left);
        int max = Math.max(leftValue, node.val + leftValue);
        int rightValue = travel(node.right);
        return Math.max(max, max + rightValue);
    }

}
