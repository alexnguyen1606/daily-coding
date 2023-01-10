package com.leetcode.dynamicprograming;

import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/6/2023
 */

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int preIndex = 0;
        for (List<Integer> list : triangle) {
            if (list.size() == 1) {
                sum += list.get(preIndex);
                continue;
            }
            if (list.get(preIndex) > list.get(preIndex + 1)) {
                preIndex = preIndex + 1;
            }
            sum += list.get(preIndex);
        }

        return sum;
    }
}
