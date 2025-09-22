package com.datastucture.slidingwindow;

public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int L = 0;
        int R = 0;
        int maxProfit = 0;
        while (R < prices.length) {
            if (L == R) {
                R++;
                continue;
            }
            int priceSell = prices[R];
            int priceBuy = prices[L];
            if (priceSell < priceBuy) {
                L = R;
                continue;
            }
            int profit = prices[R] - prices[L];
            maxProfit = Math.max(profit, maxProfit);
            R++;

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
