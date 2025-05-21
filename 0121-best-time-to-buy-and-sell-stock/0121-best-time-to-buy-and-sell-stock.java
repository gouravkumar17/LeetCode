class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int m = prices[0];
        int p = 0;
        for(int i=1;i<n;i++){
            int c = prices[i]-m;
            p = Math.max(p,c);
            m = Math.min(m,prices[i]);
        }
        return p;
    }
}