package com.brownbox_online.tree;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:43 PM ,August 23,2021
 */
public class Main {
  public static void main(String[] args) {
	  TreeNode root = null;
	  InsertToBinaryTree insertToBinaryTree = new InsertToBinaryTree();
		root =  insertToBinaryTree.insert(root,8);
	  insertToBinaryTree.insert(root,1);
	  insertToBinaryTree.insert(root,2);
	  insertToBinaryTree.insert(root,3);
	  insertToBinaryTree.insert(root,4);
	  insertToBinaryTree.insert(root,5);
        System.out.println();
  }
}
