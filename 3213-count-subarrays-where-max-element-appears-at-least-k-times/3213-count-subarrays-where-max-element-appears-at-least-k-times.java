class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long c = 0;
        int m = 0;
        for(int num:nums) m = Math.max(m,num);
        int l = 0;
        int a = 0;
        for(int r=0;r<n;r++){
            if(nums[r]==m) a++;
            while(a>=k){
                c += (n-r);
                if(nums[l]==m) a--;
                l++;
            }
        }
        return c;
    }
}