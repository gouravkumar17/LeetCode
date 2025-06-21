class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j<n){
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            while(m.get(nums[j])>k && i<=j){
                m.put(nums[i],m.get(nums[i])-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}