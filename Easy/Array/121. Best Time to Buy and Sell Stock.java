// class Solution {
//     public int maxProfit(int[] prices) {
        
//         int maxProfit = Integer.MIN_VALUE, minCost = prices[0], n = prices.length;
        
//         for(int i = 0; i < n; i++) {
//             minCost = Math.min(minCost, prices[i]);
//             maxProfit = Math.max(maxProfit, prices[i] - minCost);
//         }
        
//         return maxProfit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}