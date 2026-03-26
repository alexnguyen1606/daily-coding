package com.dsa_in_90_days.slidingwindow;

public class BestTimeToTradeStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 0;
        while (right < prices.length) {
            int priceBuy = prices[left];
            int priceSell = prices[right];
            if (priceSell < priceBuy) {
                left = right;
                continue;
            }
            maxProfit = Math.max(maxProfit, priceSell - priceBuy);
            right++;
        }
        return maxProfit;
    }
}
