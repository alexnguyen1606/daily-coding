package com.leetcode.data_struct.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:18 PM ,December 15,2020
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        int[] array = new int[n];
        for (int i =0;i<n;i++){
            array[i] = i+1;
        }
        List<TreeNode> treeNodes = new ArrayList<>();
        
        return treeNodes;
    }
    private TreeNode dive(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start+ (end - start) / 2;
        TreeNode treeNode = new TreeNode(nums[middle]);
        if (start == end) {
            return treeNode;
        }
        treeNode.left = dive(nums, start, middle - 1);
        treeNode.right = dive(nums, middle + 1, end);
        return treeNode;
    }
}
