class Solution {
    private int first(int nums[], int t){
        int n = nums.length;
        int idx = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=t) high = mid-1;
            else low = mid+1;
            if(nums[mid]==t) idx = mid;
        }
        return idx;
    }
    private int last(int nums[], int t){
        int n = nums.length;
        int idx = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=t) low = mid+1;
            else high = mid-1;
            if(nums[mid]==t) idx = mid;
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        // int n = nums.length;
        // int res[] = {-1,-1};
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         res[0] = i; 
        //         break;
        //     }
        // }
        // for(int i=n-1;i>=0;i--){
        //     if(nums[i]==target){
        //         res[1] = i;
        //         break;
        //     }
        // }
        // return res;

        int ans[] = new int[2];
        ans[0] = first(nums,target);
        ans[1] = last(nums,target);
        return ans;
    }
}