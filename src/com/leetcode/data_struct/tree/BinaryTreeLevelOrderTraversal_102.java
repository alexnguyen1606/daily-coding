package com.leetcode.data_struct.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/29/2023
 */

public class BinaryTreeLevelOrderTraversal_102 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        List<List<Integer>> travelLevel = new LinkedList<>();
        List<Integer> rootLevel = new ArrayList<>();
        rootLevel.add(root.val);
        travelLevel.add(rootLevel);

        travel(root, travelLevel);

        return travelLevel;
    }

    private static void travel(TreeNode node, List<List<Integer>> travelLevel) {
        if (node == null) {
            return;
        }
        if (node.right == null && node.left == null) {
            return;
        }

        List<Integer> level = new LinkedList<>();
        travelLevel.add(level);
        if (node.left != null) {
            level.add(node.left.val);
            travel(node.left, travelLevel);
        }

        if (node.right != null) {
            level.add(node.right.val);
            travel(node.right, travelLevel);
        }

    }

}
