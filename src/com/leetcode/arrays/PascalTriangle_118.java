package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>2:57 PM ,December 03,2020
 */
public class PascalTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listResult = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
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
                    int l2 = preList.get(j + 1);
                    array.add(j, l1 + l2);
                }
                array.add(i, 1);
                listResult.add(array);
            }
        }
        return listResult;
    }
}
