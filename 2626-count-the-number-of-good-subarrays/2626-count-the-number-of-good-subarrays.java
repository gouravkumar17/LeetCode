class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        long res = 0;
        long p = 0;
        Map<Integer,Integer> m = new HashMap<>();
        while(j<n){
            p += m.getOrDefault(nums[j],0);
            m.put(nums[j], m.getOrDefault(nums[j],0)+1);
            while(p>=k){
                res += (n-j);
                m.put(nums[i],m.get(nums[i])-1);
                p -= m.get(nums[i]);
                i++;
            }
            j++;
        }
        return res;
    }
}