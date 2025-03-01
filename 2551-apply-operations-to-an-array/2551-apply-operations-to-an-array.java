class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]<<1;
                nums[i+1] = 0;
            }
        }
        for(int i=0,j=0;i<n;i++){
            if(nums[i]!=0){
                int dp = nums[i];
                nums[i] = nums[j];
                nums[j] = dp;
                j++;
            }
        }
        return nums;
    }
}