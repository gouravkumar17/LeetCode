class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int maxL = 1;
        int inc = 1;
        int dec = 1;
        for(int i=1;i<n;i++){
            int c1 = nums[i];
            int c2 = nums[i-1];
            if(c1>c2){
                inc++;
                dec = 1;
            }
            else if(c1<c2){
                dec++;
                inc = 1;
            }
            else{
                inc = 1;
                dec = 1;
            }
            maxL = Math.max(maxL,Math.max(inc,dec));
        }
        return maxL;
    }
}