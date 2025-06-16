class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int s = 0;
        int m = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            s = s+nums[i];
            while(s>=target){
                m = Math.min(m,i-l+1);
                s = s-nums[l];
                l++;
            }
        }
        if(m==Integer.MAX_VALUE) return 0;
        else return m;
    }
}