class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            int x = timeSeries[i+1]-timeSeries[i];
            if(x>=duration) ans += duration;
            else ans += x;
        }
        return ans+=duration;
    }
}