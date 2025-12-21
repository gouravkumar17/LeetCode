class Solution {
    public void moveZeroes(int[] nums) {
        // int n = nums.length;
        // int j = 0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //         j++;
        //     }
        // }


        int n = nums.length;
        if(n==0) return;
        int pos = 0;
        for(int num:nums){
            if(num!=0){
                nums[pos] = num;
                pos++;
            }
        }
        while(pos<n){
            nums[pos] = 0;
            pos++;
        }
    }
}