package com.leetcode.data_struct.tree;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:19 AM ,December 03,2020
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
       
        return lists;
    }
    
    public void checkAndAdd(List<List<Integer>> lists,TreeNode treeNode,List<Integer> list,int sum){
        if (treeNode.right== null && treeNode.left==null){
            list.add(treeNode.val);
            int total = list.stream().mapToInt(item -> item).sum();
            if (total == sum){
                lists.add(list);
            }
        }
    }
}
