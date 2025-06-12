class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0;
        int ed = n-1;
        while(st<ed){
            int m = st+(ed-st)/2;
            if(nums[m]>nums[m+1]) ed = m;
            else st = m+1;
        }
        return st;
    }
}