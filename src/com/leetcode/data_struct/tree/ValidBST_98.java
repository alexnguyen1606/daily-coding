package com.leetcode.data_struct.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>11:45 AM ,December 10,2020
 */
public class ValidBST_98 {

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsInorder(root, list);
        int i = 1;
        int j = list.size() - 1;
        while (i <= j) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
            if (list.get(j - 1) >= list.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private void dfsInorder(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        dfsInorder(treeNode.left, list);
        list.add(treeNode.val);
        dfsInorder(treeNode.right, list);
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = root.left == null || root.left.val < root.val;
        boolean right = root.right == null || root.right.val > root.val;

        return left && right && isValidBST2(root.left) && isValidBST2(root.right);
    }

}
