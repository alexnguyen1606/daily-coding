package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:18 PM ,August 23,2021
 */
public class SearchInABinarySearchTree_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root==null){
			return null;
		}
		if (root.val == val){
			return root;
		}
		if (root.val < val){
			return searchBST(root.right,val);
		}else {
			return searchBST(root.left,val);
		}
	}
	
	public TreeNode search(TreeNode root, int val) {
		while (root!=null){
			if (root.val==val){
				break;
			}
			if (root.val > val){
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return root;
	}
}
