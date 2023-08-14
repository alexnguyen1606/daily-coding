package com.leetcode.dynamicprograming;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/6/2023
 */

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        return dfs(0, 0, triangle);
    }

    private static int dfs(int level, int i, List<List<Integer>> triangle) {
        int path = triangle.get(level).get(i);
        if(level < triangle.size() - 1) {
            path += Math.min(dfs(level + 1, i, triangle), dfs(level + 1, i + 1, triangle));
        }

        return path;

    }

    public static void main(String[] args) {
        Triangle_120 triangle = new Triangle_120();
        List<Integer> array1 = Arrays.asList(-1);
        List<Integer> array2 = Arrays.asList(2, 3);
        List<Integer> array3 = Arrays.asList(1, -1, -3);
        List<Integer> array4 = Arrays.asList(2, 3, 4, 5);
        List<Integer> array5 = Arrays.asList(7, 8, 9, 10, 11);
        List<List<Integer>> list = Arrays.asList(array1, array2, array3);
        int sumMin = triangle.minimumTotal(list);
        System.out.println(sumMin);
    }

}
