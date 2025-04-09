class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = nums[0];
        if(m<k) return -1;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>k){
                cnt++;
                while(i+1<n && nums[i]==nums[i+1]) i++;
            }
        }
        return cnt;
    }
}