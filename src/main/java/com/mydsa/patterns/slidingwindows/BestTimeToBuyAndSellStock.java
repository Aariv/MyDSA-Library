package com.mydsa.patterns.slidingwindows;

public class BestTimeToBuyAndSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * @param prices
     * @return The maximum profit you can achieve by making at most one buy and one sell operation.
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // buy here
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);  // sell here
            }
        }
        return maxProfit;
    }
}
