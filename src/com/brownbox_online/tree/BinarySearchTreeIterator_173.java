package com.brownbox_online.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:15 PM ,October 02,2021
 */
public class BinarySearchTreeIterator_173 {
  public static class BSTIterator {

    private List<Integer> list;
    private final Integer SIZE;
    private int index;

    public BSTIterator(TreeNode root) {
      list = new ArrayList<>();
      travel(root, list);
      this.SIZE = list.size();
      index = 0;
    }

    // Return min value if exits
    public int next() {
      if (!hasNext()) {
        return -1;
      }
      return list.get(index++);
    }

    public boolean hasNext() {
      return index < SIZE;
    }

    private void travel(TreeNode root, List<Integer> result) {
      if (root == null) {
        return;
      }
      result.add(root.val);
      travel(root.left, result);
      travel(root.right, result);
    }
  }
}
