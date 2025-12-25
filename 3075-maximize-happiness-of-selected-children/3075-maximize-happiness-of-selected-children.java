class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        int cnt = 0;
        long ans = 0;
        Arrays.sort(happiness);
        for(int i=n-1;i>=n-k;i--){
            int total = happiness[i]+cnt;
            if(total>0) ans = ans+(long)total;
            cnt--;
        }
        return ans;
    }
}