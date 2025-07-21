class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int t = 0;
        int p = 0;
        for(int i=0;i<n;i++){
            if(t<nums[i]){
                t = nums[i];
                p = i;
            }
        }
        for(int i=0;i<n;i++){
            if(t!=nums[i] && t<2*nums[i]) return -1;
        }
        return p;
    }
}