package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 1/4/2023
 */

public class MinCostClaimbingStars_747 {

    public int minCostClimbingStairs(int[] cost) {
        int[] summaryCost = new int[cost.length + 1];
        summaryCost[0] = 0;
        summaryCost[1] = 0;
        for (int i = 2 ; i<= cost.length ; i++ ) {
            summaryCost[i] = Math.min(summaryCost[i-1] + cost[i-1], summaryCost[i-2] + cost[i-2]);
        }
        return summaryCost[cost.length];
    }

}
