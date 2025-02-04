class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxS = nums[0];
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) sum = sum+nums[i];
            else{
                maxS = Math.max(maxS,sum);
                sum = nums[i];
            }
        }
        int res = Math.max(maxS,sum);
        return res;
    }
}