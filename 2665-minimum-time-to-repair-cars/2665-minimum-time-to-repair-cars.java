class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,ranks[i]);
        }
        long l = 1;
        long h = (long)mx*cars*cars;
        long ans = 0;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(valid(mid,ranks,cars)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    public boolean valid(long mid,int ranks[],int cars){
        long cnt = 0;
        for(int i:ranks){
            long c = mid/i;
            cnt += (long)Math.sqrt(c);
        }
        if(cnt>=cars) return true;
        return false;
    }
}