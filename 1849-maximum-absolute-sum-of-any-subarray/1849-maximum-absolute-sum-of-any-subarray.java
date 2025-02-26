class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxV = 0;
        int minV = 0;
        int p = 0;
        for(int i=0;i<n;i++){
            nums[i] = nums[i]+p;
            maxV = Math.max(maxV,nums[i]);
            minV = Math.min(minV,nums[i]);
            p = nums[i];
        }
        return maxV-minV;
    }
}