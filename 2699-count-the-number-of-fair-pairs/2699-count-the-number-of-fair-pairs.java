class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = 0;
        long res = 0;
        for(int i=n-1;i>0;i--){
            if(nums[i]+nums[i-1]<lower) break;
            if(nums[i]+nums[l]>upper) continue;
            while(r<i && nums[r] + nums[i]<=upper) r++;
            if(r==i || nums[r]+nums[i]>upper) r--;
            while(l<=r && nums[l]+nums[i]<lower) l++;
            if(l<=r) res += (r-l+1);
        }
        return res;
    }
}