package com.leetcode.data_struct.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:47 AM ,December 11,2020
 */
public class RightSideView_199 {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    rightSideView(root, list);

    return list;
  }

  private void rightSideView(TreeNode treeNode, List<Integer> list) {
    if (treeNode == null) {
      return;
    }
    list.add(treeNode.val);
    if (treeNode.right==null){
        rightSideView(treeNode.left,list);
    }else {
        rightSideView(treeNode.right, list);
    }
 
  }
}
