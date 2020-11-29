package com.leetcode.data_struct.treenode;

public class MaximumDepthOfBinaryTree_104 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l1  = lengthOfNode(root.left,1);
        int l2  = lengthOfNode(root.right,1);
        return l1> l2 ? l1 : l2;
    }

    public int lengthOfNode(TreeNode node,int length){
        if (node == null) {
            return length;
        }
        int l1  = lengthOfNode(node.left,length+1);
        int l2  = lengthOfNode(node.right,length+1);
        return l1> l2 ? l1 : l2;
    }

  public static void main(String[] args) {
  }
}
