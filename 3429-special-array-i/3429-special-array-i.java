class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            int c1 = nums[i-1];
            int c2 = nums[i];
            if(c1%2==c2%2) return false;
        }
        return true;
    }
}