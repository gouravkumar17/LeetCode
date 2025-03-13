class Solution {
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int arr[],int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;
        int j;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]) break;
        }
        if(i>=0){
            for(j=n-1;j>i;j--){
                if(nums[j]>nums[i]) break;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
}