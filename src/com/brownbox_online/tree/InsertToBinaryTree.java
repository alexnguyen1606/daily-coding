package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:39 PM ,August 23,2021
 */
public class InsertToBinaryTree {
    public TreeNode addNodeToBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        }
        if (root.val > val) {
            root.left = addNodeToBST(root.left, val);
        } else if (root.val < val) {
            root.right = addNodeToBST(root.right, val);
        }
        return root;
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            TreeNode temp = root;
            while (true) {
                if (temp.val > val) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(val);
                        break;
                    }
                    temp = temp.left;
                } else if (temp.val < val) {
                    if (temp.right == null) {
                        temp.right = new TreeNode(val);
                        break;
                    }
                    temp = temp.right;
                } else {
                    break;
                }
            }
        }

        return root;
    }

}
