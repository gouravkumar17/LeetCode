class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int len = 0;
        int val = 0;
        int l = 0;
        for(int r=0;r<n;r++){
            while((val & nums[r])!=0){
                val = val^nums[l];
                l++;
            }
            val |= nums[r];
            len = Math.max(len,r-l+1);
        }
        return len;
    }
}