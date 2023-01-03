package com.leetcode.dynamicprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 10/11/2022
 */

public class PascalTriangle_118 {

    static final List<Integer> first = Arrays.asList(1);
    static final List<Integer> second = Arrays.asList(1, 1);


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(0, first);
        if (numRows == 1) {
            return result;
        }
        result.add(1, second);
        if (numRows == 2) {
            return result;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> previous = result.get(i - 1);
            int newSize = previous.size() + 1;

            List<Integer> current = new ArrayList<>(newSize);
            for (int j = 0; j < newSize; j++) {
                if (j == 0 || j == previous.size()) {
                    current.add(j, 1);
                    continue;
                }
                current.add(j, previous.get(j - 1) + previous.get(j));
            }
            result.add(i, current);
        }
        return result;
    }


}
