class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int c = 1;
        int maxL = 1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                c++;
                maxL = Math.max(maxL,c);
            }
            else c = 1;
        }
        return maxL;
    }
}