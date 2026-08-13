class Solution {
    public int maxProfit(int[] prices) {
        int mprofit=0;
        int mprice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<mprice){
                mprice=prices[i];
            }
            int profit = prices[i]-mprice;
            if(profit>mprofit){
                mprofit =profit;
            }
        }
        return mprofit;
    }
}