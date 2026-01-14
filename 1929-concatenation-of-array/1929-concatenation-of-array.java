class Solution {
    public int[] getConcatenation(int[] nums) {
        // int n = nums.length;
        // int ans[] = new int[2*n];
        // for(int i=0;i<n;i++){
        //     ans[i] = nums[i];
        //     ans[i+n] = nums[i];
        // }
        // return ans;
        int n = nums.length*2;
        int ans[] = new int[n];
        int p = 0;
        for(int i:nums){
            ans[p] = i;
            p++;
        }
        for(int i:nums){
            ans[p] = i;
            p++;
        }
        return ans;
    }
}