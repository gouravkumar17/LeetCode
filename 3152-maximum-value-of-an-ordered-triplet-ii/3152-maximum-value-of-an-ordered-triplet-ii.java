class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long m = 0;
        int a = nums[0];
        int b = Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            b = Math.max(b,a-nums[i]);
            a = Math.max(a,nums[i]);
            m = Math.max(m,(long)b*nums[i+1]);
        }
        return m;
    }
}