package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>1:50 PM ,December 10,2020
 */
public class DeleteNodeInBST_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
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

    //return giá trị node trái cùng
    private int leftMostNode(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return leftMostNode(root.left);
    }

    //return giá trị node phải cùng
    private int rightMostNode(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }
        return rightMostNode(root.right);
    }
}
