package com.leetcode.dynamicprograming;

/**
 * @author: Nguyen Anh Tuan
 * @created: 10/13/2022
 */

public class BestTimeTradingStock_121 {

    public int maxProfit(int[] prices) {
        int minPriceBuyIndex = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - prices[minPriceBuyIndex]);
            if (prices[i] < prices[minPriceBuyIndex]) {
                minPriceBuyIndex = i;
            }
        }
        return maxProfit;

    }

}
