package com.leetcode.data_struct.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:02 AM ,December 24,2020
 */
public class MergeTwoBinaryTrees_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        return t1;
    }
    public void preorderTraversal(TreeNode treeNode,TreeNode treeNode2){
       if (treeNode!=null && treeNode2!=null){
           treeNode.val = treeNode.val + treeNode2.val;
       }
        
        preorderTraversal(treeNode.left,treeNode2.left);
        preorderTraversal(treeNode.right,treeNode2.right);
    }
}

