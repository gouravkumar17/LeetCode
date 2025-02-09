class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Map<Integer,Long> cnt = new HashMap<>();
        for(int i=0;i<n;i++){
            ans += i-cnt.getOrDefault(nums[i]-i,0L);
            cnt.merge(nums[i]-i,1L,Long::sum);
        }
        return ans;
    }
}