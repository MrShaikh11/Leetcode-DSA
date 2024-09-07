class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int profit = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            if (i != 0) {
                if ((prices[i] < prices[i - 1])) {
                    maxProfit += profit;
                    min = prices[i];
                    profit = 0;
                } else {
                    profit = prices[i] - min;
                }
            }
        }
        if (i == prices.length)
            maxProfit += profit;
        return maxProfit;
    }
}