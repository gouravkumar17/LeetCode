class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int res[] = new int[n];
        int temp = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[temp] = nums[i];
                temp++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] == pivot){
                res[temp] = nums[i];
                temp++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                res[temp] = nums[i];
                temp++;
            }
        }
        return res;
    }
}