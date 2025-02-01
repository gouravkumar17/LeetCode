class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int c1 = nums[i];
            int c2 = nums[i+1];
            if(c1%2==c2%2) return false;
        }
        return true;
    }
}