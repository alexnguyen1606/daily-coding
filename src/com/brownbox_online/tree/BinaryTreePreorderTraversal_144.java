package com.brownbox_online.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:04 PM ,August 24,2021
 */
public class BinaryTreePreorderTraversal_144  {
	
	// Travel N->L->R
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		travel(root,result);
		return result;
	}
	
	public void travel(TreeNode root,List<Integer> result){
		if (root==null){
			return;
		}
		result.add(root.val);
		travel(root.left,result);
		travel(root.right,result);
	}
	
	
}
