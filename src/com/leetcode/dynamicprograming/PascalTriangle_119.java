package com.leetcode.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 10/11/2022
 */

public class PascalTriangle_119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> previous = new ArrayList<>(1);
        previous.add(1);
        for(int i = 1; i <= rowIndex; i++ ) {
            List<Integer> next = new ArrayList<>(i+1);
            for(int j = 0; j < i+1; j++) {
                int previousFirst = (j - 1) >= 0 ? previous.get(j-1) : 0;
                int previousSecond = j >= previous.size() ? 0 : previous.get(j);
                next.add(previousFirst + previousSecond);
            }
            previous = next;
        }
        return previous;
    }

}
