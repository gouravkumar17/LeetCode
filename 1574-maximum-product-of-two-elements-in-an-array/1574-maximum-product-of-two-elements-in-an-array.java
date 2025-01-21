class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int x = n-1;
        int y = n-2;
        return (nums[x]-1)*(nums[y]-1);
    }
}