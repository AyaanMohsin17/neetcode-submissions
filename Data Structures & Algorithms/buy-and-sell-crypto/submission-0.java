class Solution {
    public int maxProfit(int[] prices) {
     int buy=prices[0],sell,profit,maxprofit=0;
     for(int i=0;i<prices.length;i++){
        if(buy>prices[i]){
            buy=prices[i];
        }
        sell=prices[i];
        profit=sell-buy;
        if(profit>maxprofit){
            maxprofit=profit;
        }
     }
     return maxprofit;
    }
}
