class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int t = 0;
        int l = 0;
        //for(int i=0;i<n;i++) t = t+nums[i];
        for(int s:nums) t = t+s;
        for(int i=0;i<n;i++){
            int r = t-l-nums[i];
            res[i] = Math.abs(l-r);
            l = l+nums[i];
        }
        return res;
    }
}