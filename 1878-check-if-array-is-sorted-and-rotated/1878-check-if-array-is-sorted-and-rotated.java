class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int c1 = nums[i];
            int c2 = nums[(i+1)%n];
            if(c1>c2) count++;
        }
        return count<=1;
    }
}