package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:34 PM ,August 23,2021
 */
public class DeleteNodeInABST_450 {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root==null){
			return root;
		}
		if (root.val == key){
		
		}
		if (root.val > key){
			return deleteNode(root.left,key);
		}else if (root.val < key){
			return deleteNode(root.right,key);
		}
		return root;
	}
}
