package com.leetcode.arrays;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>3:19 PM ,December 03,2020
 */
public class PascalTriangle_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listResult = new ArrayList<>(rowIndex);
        for (int i = 0; i < rowIndex; i++) {
            if (i == 0) {
                List<Integer> array = new ArrayList<>(1);
                array.add(0, 1);
                listResult.add(array);
            } else if (i == 1) {
                List<Integer> array = new ArrayList<>(2);
                array.add(0, 1);
                array.add(1, 1);
                listResult.add(array);
            } else {
                List<Integer> preList = listResult.get(i - 1);
                List<Integer> array = new ArrayList<>(i + 1);
                array.add(0, 1);
                for (int j = 1; j < i; j++) {
                    int l1 = preList.get(j - 1);
                    int l2 = preList.get(j);
                    array.add(j, l1 + l2);
                }
                array.add(i, 1);
                listResult.add(array);
            }
        }
        return listResult.get(listResult.size() - 1);
    }
}
