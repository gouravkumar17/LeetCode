class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int i = n;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]==target) return m;
            if(target<nums[m]){
                i = m;
                r = m-1;
            }
            else l = m+1;
        }
        return i;
    }
}