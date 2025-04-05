class Solution {
    public int subsetXORSum(int[] nums) {
        return fun(nums,0,0);
    }
    private int fun(int nums[],int i,int x){
        int n = nums.length;
        if(i==n) return x;
        final int a = fun(nums,i+1,x);
        final int b = fun(nums,i+1,nums[i]^x);
        return a+b;
    }
}