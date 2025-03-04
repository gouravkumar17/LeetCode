class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int value = 1;
        int i = 0;
        while(i<n){
            if(nums[i]==value) value++;
            else if(nums[i]>value) return value;
            i++;
        }
        return value;
    }
}