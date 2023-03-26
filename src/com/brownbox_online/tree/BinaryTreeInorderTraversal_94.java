package com.brownbox_online.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:10 PM ,August 24,2021
 */
public class BinaryTreeInorderTraversal_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		travel(root,result);
		return result;
	}

	// L -> N -> R
	public void travel(TreeNode root,List<Integer> result){
		if (root==null){
			return;
		}
		travel(root.left,result);
		result.add(root.val);
		travel(root.right,result);
	}
}
