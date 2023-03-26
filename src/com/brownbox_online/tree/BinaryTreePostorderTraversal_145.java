package com.brownbox_online.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travel(root, result);
        return result;
    }

    // L -> R -> N
    public void travel(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        travel(root.left, result);
        travel(root.right, result);
        result.add(root.val);
    }
}
