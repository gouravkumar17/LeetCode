class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        int p = 1;
        int ans = 0;
        while(e<n){
            p = p*nums[e];
            e++;
            while(s<e && p>=k){
                p = p/nums[s];
                s++;
            }
            if(p<k) ans = ans+e-s;
        }
        return ans;
    }
}