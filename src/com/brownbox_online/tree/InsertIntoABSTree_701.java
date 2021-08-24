package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:13 PM ,August 23,2021
 */
public class InsertIntoABSTree_701 {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null){
			root = new TreeNode(val);
		}
		if (root.val > val){
			root.left = insertIntoBST(root.left,val);
		}else if (root.val < val){
			root.right = insertIntoBST(root.right,val);
		}
		return root;
	}
}
