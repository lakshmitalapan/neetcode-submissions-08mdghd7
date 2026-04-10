class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int buy = 0;
        int sell = buy + 1;
        int max = prices[sell] - prices[buy];
        int diff = 0;
        while (buy < sell && sell <= prices.length - 1) {
            diff = prices[sell] - prices[buy];
            if (prices[sell] > prices[buy] && diff > max) {
                max = diff;
            }
            if (diff <= 0) {
                buy = sell;
                sell = buy + 1;
            } else {
                sell++;
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;


    }

}
