class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long res = 0;
        int minIdx = -1, maxIdx = -1, invIdx = -1;

        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(num < minK || num > maxK){
                invIdx = i;
            }

            if(num == minK) minIdx = i;
            if(num == maxK) maxIdx = i;

            int start = Math.min(minIdx, maxIdx);
            if(start > invIdx){
                res += start - invIdx;
            }
        }
        return res;
    }
}