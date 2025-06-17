class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int st = 0;
        int end = n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[st] = nums[i];
                st++;
            }
            else{
                res[end] = nums[i];
                end--;
            }
        }
        return res;
    }
}