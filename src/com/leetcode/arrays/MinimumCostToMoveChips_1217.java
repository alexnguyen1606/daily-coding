package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 06,2020
 */
public class MinimumCostToMoveChips_1217 {
    public int minCostToMoveChips(int[] position) {
        int cost = 0;
        for (int i = 0;i<position.length;i++)
        {
            if (i+1==1){
                continue;
            }
            if (i+1%2!=0){
                cost++;
            }
        }
        return cost;
    }
}
