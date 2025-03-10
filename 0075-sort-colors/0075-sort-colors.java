class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int n = nums.length;
        int c1 = 0;
        int c2 = 0;
        int m = n-1;
        while(c1<=m){
            if(nums[c1]==0){
                int t = nums[c1];
                nums[c1] = nums[c2];
                nums[c2] = t;
                c1++;
                c2++;
            }
            else if(nums[c1]==1) c1++;
            else{
                int t = nums[c1];
                nums[c1] = nums[m];
                nums[m] = t;
                m--;
            }
        }
    }
}