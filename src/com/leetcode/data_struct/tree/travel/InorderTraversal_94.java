package com.leetcode.data_struct.tree.travel;

import com.leetcode.data_struct.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>10:56 AM ,December 11,2020
 */
public class InorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private void dfs(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        dfs(treeNode.left, list);
        list.add(treeNode.val);
        dfs(treeNode.right, list);
    }

    private TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root;
        TreeNode preNode = null;
        while (temp != null) {
            if (temp.val == key) { // current temp is node need delete
                if (temp.right == null && temp.left == null) { // temp is leaf
                    if (preNode != null && preNode.val > key) {
                        preNode.left = null;
                    } else if (preNode != null) {
                        preNode.right = null;
                    } else {
                        root = null;
                    }
                } else if (temp.right != null && temp.left != null) { // temp with two node child
                    int leftMostNode = leftMostNode(temp.right);
                    temp.val = leftMostNode;
                    temp.right = deleteNode(temp.right, leftMostNode);
                } else if (temp.right != null) { // temp is internal node with one node child
                    if (preNode == null) {
                        root = temp.right;
                    } else if (preNode.val > key) {
                        preNode.left = temp.right;
                    } else {
                        preNode.right = temp.right;
                    }

                } else {
                    if (preNode == null) {
                        root = temp.left;
                    } else if (preNode.val > key) {
                        preNode.left = temp.left;
                    } else {
                        preNode.right = temp.left;
                    }
                }
                return root;
            }
            preNode = temp;
            if (temp.val > key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return root;
    }

    private int leftMostNode(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return leftMostNode(root.left);
    }
}
