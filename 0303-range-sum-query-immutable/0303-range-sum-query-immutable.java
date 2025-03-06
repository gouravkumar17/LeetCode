class NumArray {
    int nums[];
    public NumArray(int[] nums) {
        int n = nums.length;
        this.nums = new int[n];
        System.arraycopy(nums,0,this.nums,0,n);
    }
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */